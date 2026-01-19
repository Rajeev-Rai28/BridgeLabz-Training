package com.day6.IceCreamRush;

public class IceCreamFlavor {

    private String name;
    private int soldCount; // how many times this flavor was sold

    public IceCreamFlavor(String name, int soldCount) {
        this.name = name;
        this.soldCount = soldCount;
    }

    public String getName() {
        return name;
    }

    public int getSoldCount() {
        return soldCount;
    }

    @Override
    public String toString() {
        return name + " -> Sold: " + soldCount;
    }
}
