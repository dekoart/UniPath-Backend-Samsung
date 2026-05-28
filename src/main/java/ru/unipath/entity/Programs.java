package ru.unipath.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "programs")
public class Programs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "university_id")
    private Universities university;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "category", length = 100)
    private String category;

    @Column(name = "form", length = 50)
    private String form;

    @Column(name = "budget")
    private Integer budget;

    @Column(name = "paid")
    private Integer paid;

    @Column(name = "price")
    private Integer price;

    @Column(name = "budget_score")
    private Integer budgetScore;

    @Column(name = "paid_score")
    private Integer paidScore;

    public Programs() {

    }

    public Programs(Universities university, String name, String category, String form, Integer budget, Integer paid, Integer price) {
        this.university = university;
        this.name = name;
        this.category = category;
        this.form = form;
        this.budget = budget;
        this.paid = paid;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public Universities getUniversity() {
        return university;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getForm() {
        return form;
    }

    public Integer getBudget() {
        return budget;
    }

    public Integer getPaid() {
        return paid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUniversity(Universities university) {
        this.university = university;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getBudgetScore() {
        return budgetScore;
    }

    public void setBudgetScore(Integer budgetScore) {
        this.budgetScore = budgetScore;
    }

    public Integer getPaidScore() {
        return paidScore;
    }

    public void setPaidScore(Integer paidScore) {
        this.paidScore = paidScore;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Programs programs = (Programs) o;
        return Objects.equals(id, programs.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Programs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", form='" + form + '\'' +
                ", budget=" + budget +
                ", paid=" + paid +
                ", budgetScore=" + budgetScore +
                ", paidScore=" + paidScore +
                '}';
    }
}