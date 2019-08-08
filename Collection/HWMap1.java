package Collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HWMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap tm=new TreeMap();
		
		tm.put(11, "Deepak");
		tm.put(22, "Kajal");
		tm.put(33, "pooja");
		tm.put(44, "Sunil");

		System.out.println(tm);
		
		
		Set set = tm.entrySet();
		 
	    // Get an iterator
	    Iterator it = set.iterator();
	 
	    // Display elements
	    while(it.hasNext()) {
	      Map.Entry me = (Map.Entry)it.next();
	      System.out.println(me);
	      System.out.print("Key is: "+me.getKey() + " & ");
	      System.out.println("Value is: "+me.getValue());
	      
	      
	      
	}


	}}
