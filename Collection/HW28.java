package Collection;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class Demo1{
	
	void iteratorr(){
	
		LinkedList ls=new LinkedList();
		
		ls.add("Deepak");
		ls.add("Raj");
		ls.add("Kajal");
		ls.add("Sunil");
		
		System.out.println(ls);
		System.out.println("Enter Index ");
		Scanner sc=new  Scanner(System.in);
		int a=sc.nextInt();
		ls.offerFirst(a);
			 ls.offerLast(a);
		}
	}

	