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
    private String phone;
    private String email;
    private String website;
    private Integer budgetPlaces;
    private Integer paidPlaces;
    private Integer pricePerYear;
    private String admissionPhone;
    private String admissionEmail;
    private String admissionWebsite;
    private String admissionHours;

    public UniversityResponse(Long id, String name, String city, String address,
                              String logo, String type, Boolean hasDormitory,
                              Boolean hasMilitary, Boolean hasExchange,
                              Integer programsCount, Integer minBudgetScore,
                              String phone, String email, String website,
                              Integer budgetPlaces, Integer paidPlaces,
                              Integer pricePerYear, String admissionPhone,
                              String admissionEmail, String admissionWebsite,
                              String admissionHours) {
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
        this.phone = phone;
        this.email = email;
        this.website = website;
        this.budgetPlaces = budgetPlaces;
        this.paidPlaces = paidPlaces;
        this.pricePerYear = pricePerYear;
        this.admissionPhone = admissionPhone;
        this.admissionEmail = admissionEmail;
        this.admissionWebsite = admissionWebsite;
        this.admissionHours = admissionHours;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getHasDormitory() {
        return hasDormitory;
    }

    public void setHasDormitory(Boolean hasDormitory) {
        this.hasDormitory = hasDormitory;
    }

    public Boolean getHasMilitary() {
        return hasMilitary;
    }

    public void setHasMilitary(Boolean hasMilitary) {
        this.hasMilitary = hasMilitary;
    }

    public Boolean getHasExchange() {
        return hasExchange;
    }

    public void setHasExchange(Boolean hasExchange) {
        this.hasExchange = hasExchange;
    }

    public Integer getProgramsCount() {
        return programsCount;
    }

    public void setProgramsCount(Integer programsCount) {
        this.programsCount = programsCount;
    }

    public Integer getMinBudgetScore() {
        return minBudgetScore;
    }

    public void setMinBudgetScore(Integer minBudgetScore) {
        this.minBudgetScore = minBudgetScore;
    }

    // Новые геттеры
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Integer getBudgetPlaces() {
        return budgetPlaces;
    }

    public void setBudgetPlaces(Integer budgetPlaces) {
        this.budgetPlaces = budgetPlaces;
    }

    public Integer getPaidPlaces() {
        return paidPlaces;
    }

    public void setPaidPlaces(Integer paidPlaces) {
        this.paidPlaces = paidPlaces;
    }

    public Integer getPricePerYear() {
        return pricePerYear;
    }

    public void setPricePerYear(Integer pricePerYear) {
        this.pricePerYear = pricePerYear;
    }

    public String getAdmissionPhone() {
        return admissionPhone;
    }

    public void setAdmissionPhone(String admissionPhone) {
        this.admissionPhone = admissionPhone;
    }

    public String getAdmissionEmail() {
        return admissionEmail;
    }

    public void setAdmissionEmail(String admissionEmail) {
        this.admissionEmail = admissionEmail;
    }

    public String getAdmissionWebsite() {
        return admissionWebsite;
    }

    public void setAdmissionWebsite(String admissionWebsite) {
        this.admissionWebsite = admissionWebsite;
    }

    public String getAdmissionHours() {
        return admissionHours;
    }

    public void setAdmissionHours(String admissionHours) {
        this.admissionHours = admissionHours;
    }
}