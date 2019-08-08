package Collection;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class HWse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet ts=new TreeSet();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		
		Iterator<Integer> iterator = ts.iterator(); 
		
		while(iterator.hasNext()) {
			
			int i=iterator.next();
			
			System.out.println(i);
			
		}
		
	}

}
