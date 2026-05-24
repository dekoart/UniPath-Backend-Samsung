package ru.unipath.dto.response;

public class AuthResponse {
    private String token; // JWT-токен
    private Long id;
    private String message;

    public AuthResponse() {

    }

    public AuthResponse(String token, Long id, String message) {
        this.token = token;
        this.id = id;
        this.message = message;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
