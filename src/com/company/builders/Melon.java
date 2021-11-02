package com.company.builders;

public class Melon {

    private String type;
    private int weight;

    public Melon(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {

        String text = "Greutate melon este : " + this.weight;
        return text;
    }
}
