package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MCW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();
		
		al.add("Deepak");
		al.add("Sunil");
		al.add("jyoti");
		al.add("kajal");
		al.add("Ravi");
		
		System.out.println(al);
		
		ListIterator<String> iterator=al.listIterator();
		
		while(iterator.hasNext()) {
			
			String s=iterator.next(); 
			if(s.equals("Deepak")) {
				
				System.out.println("add"+s);
				iterator.add("Swati");
				
				//System.out.println("add"+s);
				
			}
			//System.out.println(al);
			else if(s.equals("Sunil")) {
				
				//System.out.println(s);
				iterator.remove();
				System.out.println("Remove"+s);
				
			}
			else if(s.equals("jyoti")) {
				
				System.out.println("set"+s);
				iterator.set( "Prachi");
			}
			
		}
		
		System.out.println(al);
		
	}

	
}
