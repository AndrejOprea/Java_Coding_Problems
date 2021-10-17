package com.company.builders;

public class ExamplePhone {

    private String os;
    private String processor;
    private double screenSize;
    private int battery;
    private int cameraResolution;

    public ExamplePhone(String os, String processor, double screenSize, int battery, int cameraResolution) {
        this.os = os;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "ExamplePhone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                ", cameraResolution=" + cameraResolution +
                '}';
    }
}
