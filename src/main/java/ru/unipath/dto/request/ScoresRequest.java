package ru.unipath.dto.request;

import java.util.List;

public class ScoresRequest {
    private Long userId;
    private List<SubjectScore> scores;

    public static class SubjectScore { // // вложенный класс удобнее собирать запрос
        private Long subjectId;
        private Integer score;

        public Long getSubjectId() {
            return subjectId;
        }

        public void setSubjectId(Long subjectId) {
            this.subjectId = subjectId;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<SubjectScore> getScores() {
        return scores;
    }

    public void setScores(List<SubjectScore> scores) {
        this.scores = scores;
    }
}