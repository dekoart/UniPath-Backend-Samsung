package ru.unipath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.unipath.entity.Universities;
import java.util.List;

public interface UniversitiesRepository extends JpaRepository<Universities, Long> {

    @Query("SELECT u FROM Universities u WHERE " +
            "(:city IS NULL OR u.city.name LIKE %:city%) AND " +
            "(:type IS NULL OR u.type = :type) AND " +
            "(:hasDormitory IS NULL OR u.hasDormitory = :hasDormitory) AND " +
            "(:hasMilitary IS NULL OR u.hasMilitary = :hasMilitary) AND " +
            "(:hasExchange IS NULL OR u.hasExchange = :hasExchange)")
    List<Universities> findByFilters(
            @Param("city") String city,
            @Param("type") String type,
            @Param("hasDormitory") Boolean hasDormitory,
            @Param("hasMilitary") Boolean hasMilitary,
            @Param("hasExchange") Boolean hasExchange
    );
}