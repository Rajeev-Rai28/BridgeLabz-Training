package com.practiceProblems.EcoTrail;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class UserInterFace {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		TrailUtil util = new TrailUtil();
		System.out.println("Enter the number of trails to be added");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Enter trail details");
		for(int i = 0; i<n; i++) {
			String input = sc.nextLine();
			String [] parts = input.split(":");
			String trailId = parts[0];
			String name = parts[1];
			String region = parts[2];
			String difficulty = parts[3];
			int hikeCount = Integer.parseInt(parts[4]);
			//Arrays.fill(parts, null);
			Trail trail = new Trail(trailId, name, region, difficulty, hikeCount);
	            util.addTrailRecord(trail);
		}
		
		System.out.println("Enter the Trail Id to check hike status");
	    String id = sc.nextLine();
	    Trail found = util.getTrailById(id);
	    if (found != null) {
	    	System.out.println(found);
	    } else {
	        System.out.println("Trail Id " + id + " not found");
	    }
		
	    System.out.println("Most hiked trails are ");
	    util.getMostHikedTrails().forEach(System.out::println);
	    
	    System.out.println("Region-wise hike counts ");
	    util.getHikeCountByRegion().forEach((k,v) -> System.out.println(k+" : "+v+" hikes"));
	    
	    System.out.println("Trails grouped by difficulty");
	    util.groupTrailsByDifficulty().forEach((k,v) ->  {
            System.out.println(k);
            v.forEach(System.out::println);
        });
	    
	    System.out.println("Enter Trail Id to update hikes and additional hikes");
	    String tid = sc.next();
	    int hikes = sc.nextInt();
	    
	    boolean checkUpdate = util.updateHikeCount(tid, hikes);
	    if(checkUpdate) {
	    	System.out.println("Updated "+tid+" by "+ hikes+" hikes");
	    	System.out.println( util.getTrailById(tid));
	    }else {
	    	System.out.println("Not Updated "+tid+" by "+ hikes+" hikes");
	    }
	    
	    System.out.println("Filter trails by region and difficulty ");
	    String name = sc.next();
	    String difficulty = sc.next();
	    
	    util.filterTrails(name, difficulty).forEach(System.out::println);
	    
	    System.out.println("Top N trails per region");
        int topN = Integer.parseInt(sc.nextLine());
        util.getTopTrailsByRegion(topN).forEach((k, v) -> {
            System.out.println(k);
            v.forEach(System.out::println);
        });
	    
	}
}
