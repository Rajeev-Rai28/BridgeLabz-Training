package com.practiceProblems.OceanFleet;

import java.util.ArrayList;

import java.util.List;

public class VessleUtil extends Vessle{
	
	private List<Vessle> vesselList = new ArrayList<>();
	
	VessleUtil(String vesselId, String vesselName, double averageSpeed, String vesselType){
		super(vesselId, vesselName, averageSpeed, vesselType);
	}
	VessleUtil(){
		super(null, null, 0.0, null);
	}

	
	public void addVesselPerformance(Vessle vessel) {
		if(!vesselList.contains(vessel)) {
			vesselList.add(vessel);
		}
	}
	public Vessle getVesselById(String vesselId) {
		

			for(Vessle v: vesselList) {
				if(v.getVesselId().equals(vesselId)) {
					return v;
					
				}
			}
		return null;
	}

	public List<Vessle> getHighPerformanceVessels(){
		List<Vessle> result = new ArrayList<>();
		
		double speed = Double.MIN_VALUE;
		for(Vessle v: vesselList) {
			if(v.getAverageSpeed() >= speed) {
				speed = v.getAverageSpeed();
			}
		}
		
		for(Vessle v: vesselList) {
			if(v.getAverageSpeed() == speed) {
				result.add(v);			}
		}
		
		return result;
		
	}
}
