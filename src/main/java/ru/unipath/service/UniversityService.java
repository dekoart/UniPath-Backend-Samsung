package ru.unipath.service;

import ru.unipath.dto.request.UniversityFilterRequest;
import ru.unipath.dto.response.UniversityResponse;
import ru.unipath.entity.Universities;
import ru.unipath.repository.UniversitiesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UniversityService {
    private final UniversitiesRepository repository;

    public UniversityService(UniversitiesRepository repository) {
        this.repository = repository;
    }

    public List<UniversityResponse> findUniversities(UniversityFilterRequest req) {
        List<Universities> result = repository.findByFilters(
                req.getCity(),
                req.getName(),
                req.getDirection(),
                req.getType(),
                req.getHasDormitory(),
                req.getHasMilitary(),
                req.getHasExchange()
        );
        return result.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    private UniversityResponse toResponse(Universities uni) {
        String cityName = (uni.getCity() != null && uni.getCity().getName() != null)
                ? uni.getCity().getName()
                : "Не указан";

        int programsCount = (uni.getPrograms() != null) ? uni.getPrograms().size() : 0;

        Integer minBudgetScore = null;
        if (uni.getPrograms() != null && !uni.getPrograms().isEmpty()) {
            minBudgetScore = uni.getPrograms().stream()
                    .map(p -> p.getBudgetScore())
                    .filter(score -> score != null)
                    .min(Integer::compareTo)
                    .orElse(null);
        }

        return new UniversityResponse(
                uni.getId() != null ? uni.getId() : 0L,
                uni.getName() != null ? uni.getName() : "Без названия",
                cityName,
                uni.getAddress() != null ? uni.getAddress() : "",
                uni.getLogo() != null ? uni.getLogo() : "",
                uni.getType() != null ? uni.getType() : "Государственный",
                uni.getHasDormitory() != null ? uni.getHasDormitory() : false,
                uni.getHasMilitary() != null ? uni.getHasMilitary() : false,
                uni.getHasExchange() != null ? uni.getHasExchange() : false,
                programsCount,
                minBudgetScore,
                uni.getPhone() != null ? uni.getPhone() : "",
                uni.getEmail() != null ? uni.getEmail() : "",
                uni.getWebsite() != null ? uni.getWebsite() : "",
                uni.getBudgetPlaces(),
                uni.getPaidPlaces(),
                uni.getPricePerYear(),
                uni.getAdmissionPhone(),
                uni.getAdmissionEmail(),
                uni.getAdmissionWebsite(),
                uni.getAdmissionHours()
        );
    }
}