package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class Demo{
	
	void iteratorr(){
	
		LinkedList ls=new LinkedList();
		
		ls.add("Deepak");
		ls.add("Raj");
		ls.add("Kajal");
		ls.add("Sunil");
		
		System.out.println("Enter Index ");
		Scanner sc=new  Scanner(System.in);
		int a=sc.nextInt();
		ListIterator itr=ls.listIterator(a); 
		
		while(itr.hasNext()) {
			
			Object s=itr.next();
			
			System.out.println(s);
			
			
		}
		
		
	}
	
	
	
}

public class HW14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Demo m=new Demo();
		m.iteratorr();
	}

}
