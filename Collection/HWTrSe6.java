package Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class HWTrSe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet ts=new TreeSet<>();
		
		ts.add("Deepak");
		ts.add("pooja");
		ts.add("sunil");
		ts.add("null");
		ts.add("swati");
		System.out.println(ts);
//		System.out.println(ts.size());
//		System.out.println(ts.first());
//		System.out.println(ts.last());
//		
		Iterator iterator =ts.iterator();
		
		while(iterator.hasNext());
		{
			
			//String s=(String) iterator.next();
			//System.out.println(s);
		System.out.println(	iterator.next());
		
		
			
		}
		

	}

}
