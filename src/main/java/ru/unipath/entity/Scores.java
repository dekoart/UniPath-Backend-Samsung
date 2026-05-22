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
    private User users;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subjects subject;

    @Column(name = "score")
    private Integer score;

    @Column(name = "year")
    private Integer year;

    public Scores() {

    }

    public Scores(User users, Subjects subject, Integer score, Integer year) {
        this.users = users;
        this.subject = subject;
        this.score = score;
        this.year = year;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public User getUsers() {
        return users;
    }

    public Subjects getSubject() {
        return subject;
    }

    public Integer getScore() {
        return score;
    }

    public Integer getYear() {
        return year;
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
                ", year=" + year +
                ", score=" + score +
                '}';
    }
}
