package ru.unipath.service;

import ru.unipath.dto.request.LoginRequest;
import ru.unipath.dto.request.RegisterRequest;
import ru.unipath.entity.Users;
import ru.unipath.repository.UsersRepository;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.util.Date;

@Service
public class AuthService {
    private final UsersRepository usersRepository;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    private final SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public AuthService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public String register(RegisterRequest req) {
        if (usersRepository.existsByEmail(req.getEmail())) {
            return "Ошибка: почта уже занята";
        }

        Users user = new Users();
        user.setEmail(req.getEmail());
        user.setPassword(encoder.encode(req.getPassword())); // encoder.encode превращает пароль через BCrypt-хэшер
        usersRepository.save(user);
        return createToken(user.getId());
    }

    public String login(LoginRequest req) {
        Users user = usersRepository.findByEmail(req.getEmail()).orElse(null);
        if (user != null && encoder.matches(req.getPassword(), user.getPassword())) {
            return createToken(user.getId());
        }
        return "Ошибка: неверный логин или пароль";
    }

    private String createToken(Long userId) {
        return Jwts.builder()
                .setSubject(String.valueOf(userId)) // записывает id
                .setExpiration(new Date(System.currentTimeMillis() + 86400000)) // срок жизни токена 24ч
                .signWith(key) // запечатывает токен ключом
                .compact(); // упаковывает
    }
}