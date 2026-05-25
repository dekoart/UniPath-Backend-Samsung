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

    @Column(name = "score")
    private Integer score;

    public Scores() {
    }

    public Scores(Users user, Subjects subject, Integer score) {
        this.user = user;
        this.subject = subject;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
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
                ", score=" + score +
                '}';
    }
}