package designpattern.structuralpatterns.flyweight;

import java.util.HashMap;

//The FlyweightFactory!
public class CoffeeFactory {

	private HashMap<String, Coffee> flavors = new HashMap<String, Coffee>();
	
	
	public Coffee getCoffeeFlavor(String flavorName) {
		
		Coffee flavor = flavors.get(flavorName);
		if(flavor==null){
			flavor = new Coffee(flavorName);
			flavors.put(flavorName, flavor);
			}
		return flavor;
		
	}
	
	 public int getTotalCoffeeFlavorsMade() {
	        return flavors.size();
	    }
}
