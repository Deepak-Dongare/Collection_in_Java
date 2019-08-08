package Collection;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class Demo22{
	
	void iteratorr(){
	
		LinkedList ls=new LinkedList();
		
		ls.add("Deepak");
		ls.add("Raj");
		ls.add("Kajal");
		ls.add("Sunil");
		
		System.out.println(ls);
	//	System.out.println("Enter Index ");
		//Scanner sc=new  Scanner(System.in);
	//	int a=sc.nextInt();
		System.out.println(ls.getFirst());
			 System.out.println(ls.getLast());
		}
	
	
	}
class HW30{
	
	
	public static void main(String[] args) {
		

		Demo22  dd=new Demo22();
		dd.iteratorr();
		
		
		
	}
}
	