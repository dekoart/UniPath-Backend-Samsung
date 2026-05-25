package ru.unipath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.unipath.entity.Favorites;
import ru.unipath.entity.Universities;
import ru.unipath.entity.Users;

import java.util.List;
import java.util.Optional;

public interface FavoritesRepository extends JpaRepository<Favorites, Long> {

    List<Favorites> findByUserId(Long userId); // найти все избранные вузы пользователя

    Optional<Favorites> findByUserAndUniversity(Users user, Universities university); // добавил ли пользователь этот вуз в избранное?

    void deleteByUser(Users user); // удалить все избранные записи пользователя
}