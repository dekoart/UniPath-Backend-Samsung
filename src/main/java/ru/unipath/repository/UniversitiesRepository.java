package ru.unipath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.unipath.entity.Cities;
import ru.unipath.entity.Universities;

import java.util.List;

public interface UniversitiesRepository extends JpaRepository<Universities, Long> {
    List<Universities> findByCity(Cities cities); // все вузы в городе

    List<Universities> findByHasDormitoryTrue();  // все вузы с общежитием

    List<Universities> findByHasMilitaryTrue(); // все вузы с военной кафедрой

    List<Universities> findByHasExchangeTrue(); // все вузы с программами обмена

    List<Universities> findByType(String type); // все вузы по типу(гос/частный)

    List<Universities> findByCityAndHasDormitoryTrue(Cities city); // город + общежитие
}
