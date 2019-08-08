package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HWset4 {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("Deepak");
		al.add("123");
		al.add("Raj");
		al.add("Sunil");
		al.add("321");
		al.add("10");
		al.add("Hef_Shine");
		
		System.out.println(al);
		
		
		HashSet hs=new HashSet(al);
		
		
		System.out.println(">>>>>>>>>>>>>get the number of elements in a HashSet");
		System.out.println(hs.size());
		System.out.println(hs);
		
		Iterator  iteroter= hs.iterator();
		
		while(iteroter.hasNext()) {
			
			String string=(String) iteroter.next();
			
			
			System.out.println("iterate through all elements in a HashSet ");
			System.out.println(string);
		}
		
		
	}
	

}
