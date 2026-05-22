package ru.unipath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.unipath.entity.Programs;
import ru.unipath.entity.Universities;

import java.util.List;

public interface ProgramsRepository extends JpaRepository<Programs, Long> {
    List<Programs> findByUniversity(Universities university); // все программы вуза

    List<Programs> findByBudgetGreaterThan(Integer budget); //  только бюджетные места

    List<Programs> findByForm(String form); // форма обучения

    List<Programs> findByUniversityAndForm(Universities university, String form); // вуз + форма обучения

    List<Programs> findByUniversityAndBudgetGreaterThan(Universities university, Integer budget); // вуз + бюджетные места
}
