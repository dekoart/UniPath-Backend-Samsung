package ru.unipath.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "scores")
public class Scores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subjects subject;

    @Column(name = "exam_score")
    private Integer examScore;

    @Column(name = "exam_year")
    private Integer examYear;

    public Scores() {

    }

    public Scores(Users users, Subjects subject, Integer score, Integer year) {
        this.user = users;
        this.subject = subject;
        this.examScore = score;
        this.examYear = year;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    public void setExamScore(Integer examScore) {
        this.examScore = examScore;
    }

    public void setExamYear(Integer examYear) {
        this.examYear = examYear;
    }

    public Long getId() {
        return id;
    }

    public Users getUser() {
        return user;
    }

    public Subjects getSubject() {
        return subject;
    }

    public Integer getExamScore() {
        return examScore;
    }

    public Integer getExamYear() {
        return examYear;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Scores scores = (Scores) o;
        return Objects.equals(id, scores.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Scores{" +
                "id=" + id +
                ", year=" + examYear +
                ", score=" + examScore +
                '}';
    }
}
