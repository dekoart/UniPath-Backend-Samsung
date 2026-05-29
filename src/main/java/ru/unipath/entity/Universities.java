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

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "website")
    private String website;

    @Column(name = "budget_places")
    private Integer budgetPlaces;

    @Column(name = "paid_places")
    private Integer paidPlaces;

    @Column(name = "price_per_year")
    private Integer pricePerYear;

    @Column(name = "admission_phone")
    private String admissionPhone;

    @Column(name = "admission_email")
    private String admissionEmail;

    @Column(name = "admission_website")
    private String admissionWebsite;

    @Column(name = "admission_hours")
    private String admissionHours;

    public Universities() {
    }

    public Universities(Long id, String name, Cities city, String address, String site, String logo, String type, Boolean hasDormitory, Boolean hasMilitary, Boolean hasExchange, List<Programs> programs, String phone, String email, String website, Integer budgetPlaces, Integer paidPlaces, Integer pricePerYear, String admissionPhone, String admissionEmail, String admissionWebsite, String admissionHours) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.address = address;
        this.site = site;
        this.logo = logo;
        this.type = type;
        this.hasDormitory = hasDormitory;
        this.hasMilitary = hasMilitary;
        this.hasExchange = hasExchange;
        this.programs = programs;
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
        return "Universities{" + "id=" + id + ", name='" + name + '\'' + ", type='" + type + '\'' + '}';
    }
}