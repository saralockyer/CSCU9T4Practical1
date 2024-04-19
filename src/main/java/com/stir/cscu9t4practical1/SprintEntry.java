package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {

	private int repetitions;
	private int recovery;
	private float dist; 

	public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int repetitions, int recovery) {
		super(n, d, m, y, h, min, s, dist);
		this.repetitions = repetitions;
		this.recovery = recovery;
		this.dist = dist; 
	}
	
	@Override 
	public int getRepetitions() {
		return repetitions; 
	}
	
	@Override
	public int getRecovery() {
		return recovery; 
	}
	
	@Override
	public float getDistance() {
		return dist / 100 ; 
	}
	
	public String getEntry() {
		return getName() + " sprinted " + repetitions + "x" + dist + "m in " + getHour() + ":" + getMin() + ":" + getSec() + " with " + recovery + " minutes recovery on " + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
	}
}
