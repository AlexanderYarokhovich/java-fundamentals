package ru.javabegin.training.fastjava2.aggregationAndComposition.task3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {
    List<District> districts = new ArrayList<>();
    private String regionalCenter;

    public Region(List<District> districts, String regionalCenter) {
        this.districts = districts;
        this.regionalCenter = regionalCenter;
    }

    public Region() {

    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public String getRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(String regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    @Override
    public String toString() {
        return "Region{" +
                "districts=" + districts +
                ", regionalCenter='" + regionalCenter + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return districts.equals(region.districts) &&
                regionalCenter.equals(region.regionalCenter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(districts, regionalCenter);
    }
}
