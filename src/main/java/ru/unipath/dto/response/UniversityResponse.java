package ru.unipath.dto.response;

public class UniversityResponse {
    private Long id;
    private String name;
    private String city;
    private String address;
    private String logo;
    private String type;
    private Boolean hasDormitory;
    private Boolean hasMilitary;
    private Boolean hasExchange;
    private Integer programsCount;
    private Integer minBudgetScore;

    public UniversityResponse(Long id, String name, String city, String address, String logo,
                              String type, Boolean hasDormitory, Boolean hasMilitary, Boolean hasExchange,
                              Integer programsCount, Integer minBudgetScore) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.address = address;
        this.logo = logo;
        this.type = type;
        this.hasDormitory = hasDormitory;
        this.hasMilitary = hasMilitary;
        this.hasExchange = hasExchange;
        this.programsCount = programsCount;
        this.minBudgetScore = minBudgetScore;
    }

    // Геттеры (обязательно для Jackson)
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getCity() { return city; }
    public String getAddress() { return address; }
    public String getLogo() { return logo; }
    public String getType() { return type; }
    public Boolean getHasDormitory() { return hasDormitory; }
    public Boolean getHasMilitary() { return hasMilitary; }
    public Boolean getHasExchange() { return hasExchange; }
    public Integer getProgramsCount() { return programsCount; }
    public Integer getMinBudgetScore() { return minBudgetScore; }
}