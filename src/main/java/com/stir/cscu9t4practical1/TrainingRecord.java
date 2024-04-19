// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;




import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass
   public void removeEntry(Entry e) {
	   tr.remove(e);
   }
   
   // look up the entry of a given day and month
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   
   // look up all the entries on a given date
   public String lookupEntries(int d, int m, int y) {
	    ListIterator<Entry> iter = tr.listIterator();
	    StringBuilder resultBuilder = new StringBuilder("No entries found");

	    while (iter.hasNext()) {
	        Entry current = iter.next();
	        if (current.getDay() == d && current.getMonth() == m && current.getYear() == y) {
	            if (resultBuilder.toString().equals("No entries found")) {
	                resultBuilder = new StringBuilder(current.getEntry());
	            } else {
	                resultBuilder.append("\n").append(current.getEntry());
	            }
	        }
	    }

	    return resultBuilder.toString();
	}
   
   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
  
   
} // TrainingRecord