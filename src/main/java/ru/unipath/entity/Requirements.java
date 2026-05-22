package ru.unipath.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "requirements")
public class Requirements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "program_id", nullable = false)
    private Programs programs;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subjects subjects;

    @Column(name = "subject", length = 100)
    private String subject;

    @Column(name = "min_score")
    private Integer min_score;

    @Column(name = "priority")
    private Integer priority = 1;

    public Requirements() {

    }

    public Requirements(Programs programs, Subjects subjects, String subject, Integer min_score, Integer priority) {
        this.programs = programs;
        this.subjects = subjects;
        this.subject = subject;
        this.min_score = min_score;
        this.priority = priority;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrograms(Programs programs) {
        this.programs = programs;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMin_score(Integer min_score) {
        this.min_score = min_score;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public Programs getPrograms() {
        return programs;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public String getSubject() {
        return subject;
    }

    public Integer getMin_score() {
        return min_score;
    }

    public Integer getPriority() {
        return priority;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Requirements that = (Requirements) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Requirements{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", min_score=" + min_score +
                ", priority=" + priority +
                '}';
    }
}
