package com.day2.CabbyGo;

class Mini extends Vehicle {
    public Mini(String vehicleNumber) {
        super(vehicleNumber, 4, 10);
    }

    public String getType() {
        return "Mini";
    }
}

class Sedan extends Vehicle {
    public Sedan(String vehicleNumber) {
        super(vehicleNumber, 4, 15);
    }

    public String getType() {
        return "Sedan";
    }
}

class SUV extends Vehicle {
    public SUV(String vehicleNumber) {
        super(vehicleNumber, 6, 20);
    }

    public String getType() {
        return "SUV";
    }
}