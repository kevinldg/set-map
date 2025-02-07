package org.example;

public class Medication {
    private String name;
    private double price;
    private int availability;

    Medication(String name, double price, int availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public String getName() {
        return this.name;
    }

    public int getAvailability() {
        return this.availability;
    }

    public double getPrice() {
        return this.price;
    }
}
