package ru.unipath.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "favorites")
public class Favorites {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "program_id", nullable = false)
    private Programs program;

    public Favorites() {

    }

    public Favorites(Programs program, User users) {
        this.program = program;
        this.user = users;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setProgram(Programs program) {
        this.program = program;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Programs getProgram() {
        return program;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Favorites favorites = (Favorites) o;
        return Objects.equals(id, favorites.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Favorites{" +
                "id=" + id +
                '}';
    }
}
