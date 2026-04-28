package com._6.preparation2026.java21.newFeature.records;

public class Human {

    String spiceies;
    public Human(String spiceies) {
        this.spiceies = spiceies;
    }

    public Human() {
    }

    public String getSpiceies() {
        return spiceies;
    }

    public void setSpiceies(String spiceies) {
        this.spiceies = spiceies;
    }

    @Override
    public String toString() {
        return "Human{" +
                "spiceies='" + spiceies + '\'' +
                '}';
    }
}
