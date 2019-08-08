package Collection;

import java.util.Collection;
import java.util.LinkedList;

public class HW20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
			LinkedList ls=new LinkedList();
			//for(int i=0;i<5;i++) 
		//	{
				ls.add("Deepak");
				ls.add("Pooja");
				ls.add("Kajal");
				ls.add("Sunil");
				
		//	}
			//System.out.println(ls);
			
			LinkedList lss=new LinkedList((Collection) ls.clone());
		//	for(int i=0;i<5;i++) {
				
			    lss.add("Deepak");
				lss.add("Kajal");
				lss.add("Pooja");
				lss.add("Sunil");
		//	}
			System.out.println(lss);
			
		//	lss.addLast(ls);
			
		//	LinkedList lss1 = (LinkedList)ls.clone();
			//ls.addLast(lss1);
			System.out.println(ls);
	}
	

}
