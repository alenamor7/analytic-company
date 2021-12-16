package com.ac.inheritance;

public class Clothing extends Product {

    private int size;
    private String material;

    public Clothing(String name, String description, double price, int size, String material) {
        super(name, description, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + " _ " + size + " _ " + material;
    }
}
