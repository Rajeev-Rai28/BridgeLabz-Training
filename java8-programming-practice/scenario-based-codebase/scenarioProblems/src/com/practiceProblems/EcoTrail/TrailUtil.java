package com.practiceProblems.EcoTrail;



import java.util.*;
import java.util.stream.Collectors;
public class TrailUtil {
	
	private List <Trail> trailList = new ArrayList<>();
	
	public List<Trail> getTrailList(){
		return this.trailList;
	}
	
	public void setTrailList(List<Trail> list){
		this.trailList = list;
	}
	
	public void addTrailRecord(Trail trail) {
		  this.trailList.add(trail);
	}
	
	public Trail getTrailById(String trailId) {
		for(Trail t : trailList) {
			if(t.getTrailId().equals(trailId)) {
				return t;
			}
		}
		return null;
	}
	
	public Set getMostHikedTrails() {
		Set <Trail> set = new HashSet<>(); 
		int count = Integer.MIN_VALUE;
		for(Trail t : trailList) {
			if(t.getHikeCount() > count) {
				count = t.getHikeCount();
			}
		}
		
		for(Trail t : trailList) {
			if(t.getHikeCount() == count) {
				set.add(t);
			}
		}
		return set;
	}
	
	public Map getHikeCountByRegion() {
		return trailList.stream().collect(
				Collectors.groupingBy(
						Trail::getRegion,
						LinkedHashMap::new,
						Collectors.summingLong(Trail::getHikeCount)
						));
	}
	public Map<String, List<Trail>> groupTrailsByDifficulty() {
	    return trailList.stream()
	                 .collect(Collectors.groupingBy(Trail::getDifficulty));
	}
	
	public boolean updateHikeCount(String trailId, int additionalHikes) {
		for(Trail t : trailList) {
			if(t.getTrailId().equals(trailId)) {
				int count = t.getHikeCount() + additionalHikes;
				t.setHikeCount(count);
				return true;
			}
		}
		return false;
	}
	public List<Trail> filterTrails(String region, String difficulty){
		List<Trail> result = new ArrayList<>();
		for(Trail t : trailList) {
			if(t.getRegion().equals(region) && t.getDifficulty().equals(difficulty)) {
				result.add(t);
			}
		}
		return result;
	}
	public Map<String, List<Trail>> getTopTrailsByRegion(int n) {

	    return trailList.stream()
	            .collect(Collectors.groupingBy(
	                    Trail::getRegion,
	                    Collectors.collectingAndThen(
	                            Collectors.toList(),
	                            list -> list.stream()
	                                    .sorted(Comparator.comparing(Trail::getHikeCount)
	                                            .reversed())
	                                    .limit(n)
	                                    .collect(Collectors.toList())
	                    )
	            ));
	}

}