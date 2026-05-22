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
    private Users user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "university_id", nullable = false)
    private Universities university;

    public Favorites() {

    }

    public Favorites(Universities university, Users users) {
        this.university = university;
        this.user = users;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setUniversity(Universities university) {
        this.university = university;
    }

    public Long getId() {
        return id;
    }

    public Users getUser() {
        return user;
    }

    public Universities getUniversity() {
        return university;
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
