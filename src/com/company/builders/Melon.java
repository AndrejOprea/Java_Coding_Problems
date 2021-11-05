package com.company.builders;

public class Melon implements Comparable<Melon>{

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

    @Override
    public int compareTo(Melon o) {
        return Integer.compare(this.weight,o.getWeight());
    }
}
