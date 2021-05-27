package ru.javabegin.training.fastjava2.aggregationAndComposition.task4.model;

import java.util.Objects;

public class Account implements Comparable<Account>{
    private int id;
    private boolean blocking;
    private int sum;

    public Account(int id, boolean blocking, int sum) {
        this.id = id;
        this.blocking = blocking;
        this.sum = sum;
    }

    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isBlocking() {
        return blocking;
    }

    public void setBlocking(boolean blocking) {
        this.blocking = blocking;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", blocking=" + blocking +
                ", sum=" + sum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                blocking == account.blocking &&
                sum == account.sum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, blocking, sum);
    }

    @Override
    public int compareTo(Account account) {
        return this.getSum() - account.getSum();
    }


}
