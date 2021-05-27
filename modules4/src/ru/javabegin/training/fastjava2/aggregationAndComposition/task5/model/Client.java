package ru.javabegin.training.fastjava2.aggregationAndComposition.task5.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private int id;
    private List<TouristVouchers> vouchers = new ArrayList<>();

    public Client(int id, List<TouristVouchers> vouchers) {
        this.id = id;
        this.vouchers = vouchers;
    }

    public Client() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<TouristVouchers> getVouchers() {
        return vouchers;
    }

    public void setVouchers(List<TouristVouchers> vouchers) {
        this.vouchers = vouchers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id &&
                Objects.equals(vouchers, client.vouchers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vouchers);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", vouchers=" + vouchers +
                '}';
    }
}
