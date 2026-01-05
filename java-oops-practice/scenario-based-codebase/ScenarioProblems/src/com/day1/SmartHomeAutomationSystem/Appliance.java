package com.day1.SmartHomeAutomationSystem;

abstract class Appliance implements Controllable {

    private boolean isOn;
    private int powerConsumption;

    // Default power setting
    public Appliance(int powerConsumption) {
        this.powerConsumption = powerConsumption;
        this.isOn = false;
    }

    protected void setOn(boolean status) {
        this.isOn = status;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }
}