package ru.unipath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.unipath.entity.Scores;
import ru.unipath.entity.Subjects;
import ru.unipath.entity.Users;

import java.util.List;
import java.util.Optional;

public interface ScoresRepository extends JpaRepository<Scores, Long> {
    List<Scores> findByUser(Users user); // все баллы пользовтеля

    Optional<Scores> findByUserAndSubject(Users user, Subjects subject); // узнать конркетный балл по какому предмету

    void deleteByUserAndSubject(Users user, Subjects subject); // удалить конкретный балл пользователя по предмету

    void deleteByUser(Users user); // удалить все баллы по предметам пользователя
}

