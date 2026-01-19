package com.day5.cropMonitor;

public class CropMonitorApp {

    public static void main(String[] args) {

        SensorData[] data = {
            new SensorData(1050, 32.5),
            new SensorData(1010, 30.2),
            new SensorData(1090, 35.1),
            new SensorData(1025, 31.0),
            new SensorData(1005, 29.8)
        };

        System.out.println("Before Sorting (Random Sensor Data):");
        for (SensorData d : data) {
            System.out.println(d);
        }

        DataSorter.quickSort(data, 0, data.length - 1);

        System.out.println("\nAfter Sorting (By Timestamp Ascending):");
        for (SensorData d : data) {
            System.out.println(d);
        }
    }
}

