package ru.javabegin.training.fastjava2.aggregationAndComposition.task3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class District {
    List<City> cities = new ArrayList<>();
    private String districtCenter;

    public District(List<City> cities, String districtCenter) {
        this.cities = cities;
        this.districtCenter = districtCenter;
    }

    public District() {

    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public String getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(String districtCenter) {
        this.districtCenter = districtCenter;
    }

    @Override
    public String toString() {
        return "District{" +
                "cities=" + cities +
                ", districtCenter='" + districtCenter + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return cities.equals(district.cities) &&
                districtCenter.equals(district.districtCenter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cities, districtCenter);
    }
}
