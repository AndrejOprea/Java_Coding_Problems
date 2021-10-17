package com.company.builders;

public class BuilderPhone {

    private String os;
    private String processor;
    private double screenSize;
    private int battery;
    private int cameraResolution;

    public BuilderPhone setOs(String os){
        this.os = os;
        return this;
    }
    public BuilderPhone setProcessor(String processor){
        this.processor = processor;
        return this;
    }
    public BuilderPhone setScreenSize(double screenSize){
        this.screenSize = screenSize;
        return this;
    }
    public BuilderPhone setBattery(int battery){
        this.battery = battery;
        return this;
    }
    public BuilderPhone setCameraResolution(int cameraResolution){
        this.cameraResolution = cameraResolution;
        return this;
    }

    public ExamplePhone getPhone(){

        return new ExamplePhone(os,processor,screenSize,battery,cameraResolution);
    }

}
