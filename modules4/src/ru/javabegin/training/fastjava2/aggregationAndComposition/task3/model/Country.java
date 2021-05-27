package ru.javabegin.training.fastjava2.aggregationAndComposition.task3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {
    private String capital;
    private List<Region> regions = new ArrayList<>();
    private String square;

    public Country(String capital, List<Region> regions, String square) {
        this.capital = capital;
        this.regions = regions;
        this.square = square;
    }

    public Country() {
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public String getSquare() {
        return square;
    }

    public void setSquare(String square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Country{" +
                "capital='" + capital + '\'' +
                ", regions=" + regions +
                ", square='" + square + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(capital, country.capital) &&
                Objects.equals(regions, country.regions) &&
                Objects.equals(square, country.square);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capital, regions, square);
    }
}
