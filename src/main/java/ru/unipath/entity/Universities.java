package ru.unipath.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "universities")
public class Universities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY) // много вузов находятся в одном городе
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

    public void setHasExchange(Boolean hasExchange) {
        this.hasExchange = hasExchange;
    }

    public void setHasMilitary(Boolean hasMilitary) {
        this.hasMilitary = hasMilitary;
    }

    public void setHasDormitory(Boolean hasDormitory) {
        this.hasDormitory = hasDormitory;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(Cities city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Cities getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getSite() {
        return site;
    }

    public String getLogo() {
        return logo;
    }

    public String getType() {
        return type;
    }

    public Boolean getHasDormitory() {
        return hasDormitory;
    }

    public Boolean getHasMilitary() {
        return hasMilitary;
    }

    public Boolean getHasExchange() {
        return hasExchange;
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
