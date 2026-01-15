package com.day8.HomeNest;

abstract class Device implements IControllable {

    protected String deviceId;
    private boolean status;        
    protected double energyUsage;

    protected String firmwareLog;     

    public Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        this.firmwareLog = "Firmware v1.0 installed";
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public double calculateEnergy(int hours) {
        return energyUsage * hours;
    }

    protected void updateFirmware(String log) {
        firmwareLog = log;
    }

    public abstract void reset();
}
