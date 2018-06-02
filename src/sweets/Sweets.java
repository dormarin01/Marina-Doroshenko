package sweets; 

import java.util.ArrayList;
import java.util.List;

public class Sweets {
	private List<Sweet> list;
	private int containerWeight; 
	
	Sweets() {
		list = new ArrayList<>();
	}
	
	public void add(Sweet s) {
		list.add(s);
	}
	
	  
	public void remove(Sweet s) {
		list.remove(s);
	}
	
	public int getSweetsWeight() {
		for(Sweet s: list) {
			containerWeight += s.getWeight(); 
		}
		return containerWeight;
	}
	
	public Sweet getSweetBySugar(int a, int b) {
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getSugarCons() > a) {
				if(list.get(i).getSugarCons() < b) {
					return list.get(i);
				}
			}
		}
			return null;
	}
}
