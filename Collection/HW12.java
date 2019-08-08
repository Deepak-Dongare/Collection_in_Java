package Collection;

import java.util.LinkedList;

public class HW12 {

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
			
			LinkedList lss=new LinkedList();
		//	for(int i=0;i<5;i++) {
				
			    lss.add("Deepak");
				lss.add("Kajal");
				lss.add("Pooja");
				lss.add("Sunil");
		//	}
			System.out.println(lss);
			
		//	lss.addLast(ls);
			
			ls.addLast(lss);
			System.out.println(ls);
	}
	

}
