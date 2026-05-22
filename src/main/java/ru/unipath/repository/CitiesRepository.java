package ru.unipath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.unipath.entity.Cities;

import java.util.Optional;

public interface CitiesRepository extends JpaRepository<Cities, Long> {
    Optional<Cities> findByName(String name); // поиск по названию

    boolean existsByName(String name); // есть ли такой город в базе
}
