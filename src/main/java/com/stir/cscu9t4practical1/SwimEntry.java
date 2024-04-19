package com.stir.cscu9t4practical1;

public class SwimEntry extends Entry {
	
	private String location; 

    public SwimEntry(String name, int d, int m, int y, int h, int min, int s, float dist, String location) {
        super(name, d, m, y, h, min, s, dist);
        this.location = location; 
    }
    
    public String getLocation() {
    	return location;
    }
    
    public String getWhere() {
        if (location.equals("pool")) {
            return "in a pool";
        } else {
            return location;
        }
    }
    
    @Override
    public float getDistance() {
        return distance;
    }

    @Override
    public String getEntry() {
        return getName() + " swam " + distance + " km " + location + " in " + getHour() + ":" + getMin() + ":" + getSec() + " on " + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
    }
}