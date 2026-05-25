package ru.unipath.dto.response;

import java.util.List;

public class ScoresResponse {
    private Long userId;
    private List<SubjectScore> scores;

    public static class SubjectScore { // вложенный класс удобно группировать данные по предмету
        private Long subjectId;
        private String subjectName;
        private Integer score;

        public Long getSubjectId() {
            return subjectId;
        }

        public void setSubjectId(Long subjectId) {
            this.subjectId = subjectId;
        }

        public String getSubjectName() {
            return subjectName;
        }

        public void setSubjectName(String subjectName) {
            this.subjectName = subjectName;
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