package ru.unipath.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "universities")
public class Universities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id", nullable = false)
    private Cities city;

    @Column(name = "address")
    private String address;

    @Column(name = "site")
    private String site;

    @Column(name = "logo", length = 500)
    private String logo;

    @Column(name = "type", length = 50)
    private String type;

    @Column(name = "has_dormitory")
    private Boolean hasDormitory = false;

    @Column(name = "has_military")
    private Boolean hasMilitary = false;

    @Column(name = "has_exchange")
    private Boolean hasExchange = false;

    @OneToMany(mappedBy = "university", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Programs> programs = new ArrayList<>();

    public Universities() {
    }

    public Universities(String name, Cities city_id, String address, String site, String logo, String type, Boolean has_dormitory, Boolean has_military, Boolean has_exchange) {
        this.name = name;
        this.city = city_id;
        this.address = address;
        this.site = site;
        this.logo = logo;
        this.type = type;
        this.hasDormitory = has_dormitory;
        this.hasMilitary = has_military;
        this.hasExchange = has_exchange;
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

    public Cities getCity() {
        return city;
    }

    public void setCity(Cities city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
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

    public List<Programs> getPrograms() {
        return programs;
    }

    public void setPrograms(List<Programs> programs) {
        this.programs = programs;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Universities that = (Universities) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Universities{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}