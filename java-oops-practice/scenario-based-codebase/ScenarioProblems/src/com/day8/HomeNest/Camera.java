package com.day8.HomeNest;

class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId, 1.2);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Camera recording");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Camera OFF");
    }

    public void reset() {
        System.out.println("Camera recalibrated");
    }
}
