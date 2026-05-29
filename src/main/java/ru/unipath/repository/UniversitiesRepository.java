package ru.unipath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.unipath.entity.Universities;
import java.util.List;

public interface UniversitiesRepository extends JpaRepository<Universities, Long> {

    @Query(value = "SELECT u.* FROM universities u " +
            "LEFT JOIN cities c ON u.city_id = c.id " +
            "WHERE (:city IS NULL OR c.name ILIKE CONCAT('%', :city, '%')) AND " +
            "(:name IS NULL OR u.name::text ILIKE CONCAT('%', :name, '%')) AND " +
            "(:type IS NULL OR u.type = :type) AND " +
            "(:hasDormitory IS NULL OR u.has_dormitory = :hasDormitory) AND " +
            "(:hasMilitary IS NULL OR u.has_military = :hasMilitary) AND " +
            "(:hasExchange IS NULL OR u.has_exchange = :hasExchange)",
            nativeQuery = true)
    List<Universities> findByFilters(
            @Param("city") String city,
            @Param("name") String name,
            @Param("type") String type,
            @Param("hasDormitory") Boolean hasDormitory,
            @Param("hasMilitary") Boolean hasMilitary,
            @Param("hasExchange") Boolean hasExchange
    );
}