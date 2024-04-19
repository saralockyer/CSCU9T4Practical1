package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry {
	
	private String terrain; 
	private String tempo; 
	private float dist; 

	public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String terrain, String tempo) {
		super(n, d, m, y, h, min, s, dist);
		this.terrain = terrain; 
		this.tempo = tempo;
		this.dist = dist;
	}
	
	@Override
	public String getTerrain() {
		return terrain;
	}

	@Override
	public String getTempo() {
		return tempo;
	}
	
	@Override
	public String getEntry() {
		return getName() + " cycled " + dist + " km in " + getHour() + ":" + getMin() + ":" + getSec() + " on " + getDay() + "/" + getMonth() + "/" + getYear() + " on " + terrain + " at " + tempo + " tempo\n";
	}

}
