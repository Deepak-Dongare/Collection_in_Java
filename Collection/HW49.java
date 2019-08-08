package Collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class HW49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList al=new LinkedList();
		
		al.add("Deepak");
		al.add("Sunil");
		al.add("Raj");
		al.add("kajal");
		
		System.out.println(al);
		 
		ArrayList<String> all=new ArrayList(al);
		
		System.out.println(all);
		
		for(String str:all) {
			
			//System.out.print(z);
			 System.out.print( "  \t"+str);
			
		
		}
		
	
	}

}
