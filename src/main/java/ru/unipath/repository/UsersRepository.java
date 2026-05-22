package ru.unipath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.unipath.entity.Users;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByEmail(String email); //найти по почте

    boolean existsByEmail(String email); // есть ли еще с такой почтой
}
