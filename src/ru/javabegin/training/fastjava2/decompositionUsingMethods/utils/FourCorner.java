package ru.javabegin.training.fastjava2.decompositionUsingMethods.utils;

public class FourCorner {
    private int x;
    private int y;
    private int z;
    private int t;

    public FourCorner() {
    }

    public FourCorner(int x, int y, int z, int t) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.t = t;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getT() {
        return t;
    }

    public int getX() {
        return x;
    }
}
