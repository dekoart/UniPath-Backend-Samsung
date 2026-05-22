package ru.unipath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.unipath.entity.Subjects;

import java.util.Optional;

public interface SubjectsRepository extends JpaRepository<Subjects, Long> {
}
