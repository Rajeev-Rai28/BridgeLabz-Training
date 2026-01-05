package com.day1.SmartHomeAutomationSystem;

public class SmartHomeAutomationSystem {

    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan(90);
        Appliance ac = new AC();

        UserController controller = new UserController();

        System.out.println("--- Device Control ---");
        controller.controlDevice(light, true);
        controller.controlDevice(fan, true);
        controller.controlDevice(ac, true);

        System.out.println("\nEnergy Comparison");
        controller.compareEnergy(light, fan);
        controller.compareEnergy(ac, fan);

        System.out.println("\n Turning Devices OFF");
        controller.controlDevice(ac, false);
        controller.controlDevice(light, false);
        controller.controlDevice(fan, false);
    }
}