package ru.unipath.dto.request;

public class UniversityFilterRequest {
    private String city;
    private String name;
    private String type;
    private String direction;
    private Boolean hasDormitory;
    private Boolean hasMilitary;
    private Boolean hasExchange;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
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
}