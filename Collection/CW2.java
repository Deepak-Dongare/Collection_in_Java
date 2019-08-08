package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		
		System.out.println(al);
		
		//System.out.println("Enter number you want to remove");
		//Scanner sc=new Scanner(System.in);
		//String object=sc.next();
		
//		if(al==object) {
//			
//		}
		  // Iterator to traverse the list 
        Iterator iterator = al.iterator(); 
  
        System.out.println("List elements : "); 
  
        while (iterator.hasNext()) 
            System.out.print(iterator.next() + " "); 
  
        System.out.println(); 
    
 
	al.remove(10);
		System.out.println(al);
		

	}

}
