package ru.unipath.service;

import ru.unipath.dto.request.ScoresRequest;
import ru.unipath.dto.response.ScoresResponse;
import ru.unipath.entity.Scores;
import ru.unipath.entity.Subjects;
import ru.unipath.entity.Users;
import ru.unipath.repository.ScoresRepository;
import ru.unipath.repository.SubjectsRepository;
import ru.unipath.repository.UsersRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScoresService {
    private final ScoresRepository scoresRepository;
    private final UsersRepository usersRepository;
    private final SubjectsRepository subjectsRepository;

    public ScoresService(ScoresRepository scoresRepository,
                         UsersRepository usersRepository,
                         SubjectsRepository subjectsRepository) {
        this.scoresRepository = scoresRepository;
        this.usersRepository = usersRepository;
        this.subjectsRepository = subjectsRepository;
    }

    @Transactional
    public String saveScores(ScoresRequest request) {
        Users user = usersRepository.findById(request.getUserId())
                .orElseThrow(() -> new RuntimeException("Пользователь не найден"));
        scoresRepository.deleteByUser(user);
        scoresRepository.flush(); // форсим выполнение delete в бд прямо сейчас
        for (ScoresRequest.SubjectScore scoreData : request.getScores()) {
            if (scoreData.getScore() == null) {
                continue;
            }
            Subjects subject = subjectsRepository.findById(scoreData.getSubjectId())
                    .orElseThrow(() -> new RuntimeException("Предмет не найден"));
            Scores newScore = new Scores(user, subject, scoreData.getScore());
            scoresRepository.save(newScore);
        }
        return "Баллы успешно сохранены";
    }

    public ScoresResponse getScores(Long userId) {
        Users user = usersRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Пользователь не найден"));
        List<Scores> userScores = scoresRepository.findByUser(user);
        ScoresResponse response = new ScoresResponse();
        response.setUserId(userId);
        List<ScoresResponse.SubjectScore> scoreList = new ArrayList<>();
        for (Scores score : userScores) {
            ScoresResponse.SubjectScore subjectScore = new ScoresResponse.SubjectScore();
            subjectScore.setSubjectId(score.getSubject().getId());
            subjectScore.setSubjectName(score.getSubject().getName());
            subjectScore.setScore(score.getScore());
            scoreList.add(subjectScore);
        }
        response.setScores(scoreList);
        return response;
    }
}