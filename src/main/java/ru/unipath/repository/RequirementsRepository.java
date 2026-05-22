package ru.unipath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.unipath.entity.Programs;
import ru.unipath.entity.Requirements;
import ru.unipath.entity.Subjects;

import java.util.List;
import java.util.Optional;

public interface RequirementsRepository extends JpaRepository<Requirements, Long> {
    List<Requirements> findByProgram(Programs program); // все требования для программы

    Optional<Requirements> findByProgramAndSubject(Programs program, Subjects subject); // требование по предмету для программы
}

