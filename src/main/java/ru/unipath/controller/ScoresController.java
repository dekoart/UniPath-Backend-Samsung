package ru.unipath.controller;

import ru.unipath.dto.request.ScoresRequest;
import ru.unipath.dto.response.ScoresResponse;
import ru.unipath.service.ScoresService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/scores")
public class ScoresController {
    private final ScoresService scoresService;

    public ScoresController(ScoresService scoresService) {
        this.scoresService = scoresService;
    }

    @PostMapping
    public ResponseEntity<String> saveScores(@RequestBody ScoresRequest request) {
        try {
            String result = scoresService.saveScores(request);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка: " + e.getMessage());
        }
    }

    @GetMapping("/{userId}")
    public ResponseEntity<ScoresResponse> getScores(@PathVariable Long userId) {
        try {
            ScoresResponse response = scoresService.getScores(userId);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}