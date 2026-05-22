package ru.unipath.repository;

import org.h2.engine.User;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.unipath.entity.Favorites;
import ru.unipath.entity.Universities;

import java.util.List;
import java.util.Optional;

public interface FavoritesRepository extends JpaRepository<Favorites, Long> {
    List<Favorites> findByUser(Long id); // найти все избранные вузы пользователя

    Optional<Favorites> findByUserAndUniversity(User user, Universities university); // добавил ли пользователь этот вуз в избранное?

    void deleteByUser(User user); // удалить все избранные записи пользователя
}
