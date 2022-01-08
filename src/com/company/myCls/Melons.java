package com.company.myCls;

public class Melons {

    private int weight;
    private String type;

    public Melons() {
    }

    public Melons(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Melons{" +
                "weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
