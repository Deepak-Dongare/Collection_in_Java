
package Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class Demo33{
	
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
		System.out.println( ls.removeFirst());
			 System.out.println(ls.removeLast());
			 
			 System.out.println(removeAll(ls));
			 Collections.shuffle(ls);
			
			 System.out.println(ls);
			 
			 Collections.reverse(ls);
		}

	private char[] removeAll(LinkedList ls) {
		// TODO Auto-generated method stub
		return null;
	}
	}

	