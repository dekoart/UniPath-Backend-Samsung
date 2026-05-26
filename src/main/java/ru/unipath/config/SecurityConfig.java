package ru.unipath.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // отключаем ведь она
                // будет мобильному приложению отправлять пост запрос на сервер
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
        // теперь любой может достучаться до контроллеров
        return http.build();
    }
}