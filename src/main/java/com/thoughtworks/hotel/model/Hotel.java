package com.thoughtworks.hotel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Hotel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String description;
    private String address;
    private Double priceNormalWeek;
    private Double priceNormalWeekend;
    private Double priceAwardWeek;
    private Double priceAwardWeekend;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getPriceNormalWeek() {
        return priceNormalWeek;
    }

    public void setPriceNormalWeek(Double priceNormalWeek) {
        this.priceNormalWeek = priceNormalWeek;
    }

    public Double getPriceNormalWeekend() {
        return priceNormalWeekend;
    }

    public void setPriceNormalWeekend(Double priceNormalWeekend) {
        this.priceNormalWeekend = priceNormalWeekend;
    }

    public Double getPriceAwardWeek() {
        return priceAwardWeek;
    }

    public void setPriceAwardWeek(Double priceAwardWeek) {
        this.priceAwardWeek = priceAwardWeek;
    }

    public Double getPriceAwardWeekend() {
        return priceAwardWeekend;
    }

    public void setPriceAwardWeekend(Double priceAwardWeekend) {
        this.priceAwardWeekend = priceAwardWeekend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(id, hotel.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
