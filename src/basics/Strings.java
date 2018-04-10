package basics;

import java.util.HashMap;
import basics.Abstraction;

public class Strings extends Abstraction{

	public static void main(String[] args) {
	
		String name1 = "Vlad";
		String name2 = "Vlad";
		String name3 = new String("Vlad");
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());

	    HashMap <Integer, String> hash = new HashMap<Integer, String>();
	    hash.put(1, "Uno");
	    hash.put(2, "Two");
	    hash.put(3, "Three");
	    hash.put(4, "Four");
	    
	    System.out.println(abstractPrint());
	    
	    System.out.println(hash.keySet() + "  " + hash.values());
	    
	  hash.forEach((k, v) -> System.out.println(k + " " + v));
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}	
	
}
 