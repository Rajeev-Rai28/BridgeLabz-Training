package com.practiceProblems.OceanFleet;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	public static void main(String [] args) {
		
		VessleUtil util = new VessleUtil();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vessels to be added");
		int totalVessle = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter vessel details");
		for(int i = 0; i< totalVessle; i++) {

			String input = sc.nextLine();  

			String[] parts = input.split(":");

			String vesselId = parts[0];
			String vesselName = parts[1];
			double averageSpeed = Double.parseDouble(parts[2]);
			String vesselType = parts[3];
			
			Vessle vessle = new Vessle(vesselId, vesselName, averageSpeed, vesselType);
			util.addVesselPerformance(vessle);
		}
		
		System.out.println("Enter the Vessel Id to check speed");
		
		String id = sc.next();
		Vessle found = util.getVesselById(id);

        if(found != null) {
            System.out.println(found.getVesselId() + " | "
                    + found.getVesselName() + " | "
                    + found.getVesselType() + " | "
                    + found.getAverageSpeed() + " knots");
        }else {
            System.out.println("Vessel Id " + id + " not found");
        }
        System.out.println("High performance vessels are");
        List<Vessle> list =  util.getHighPerformanceVessels();
		list.stream().forEach(System.out::println);
		
		
		
	}
}
