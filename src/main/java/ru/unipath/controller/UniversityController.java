package ru.unipath.controller;

import ru.unipath.dto.request.UniversityFilterRequest;
import ru.unipath.dto.response.UniversityResponse;
import ru.unipath.service.UniversityService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/universities")
public class UniversityController {
    private final UniversityService service;

    public UniversityController(UniversityService service) {
        this.service = service;
    }

    @PostMapping("/search")
    public List<UniversityResponse> search(@RequestBody(required = false) UniversityFilterRequest req) {
        if (req == null) req = new UniversityFilterRequest();
        return service.findUniversities(req);
    }

    @GetMapping
    public List<UniversityResponse> getAll() {
        return service.findUniversities(new UniversityFilterRequest());
    }
}