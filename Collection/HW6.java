package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element");
		for(int i=0;i<5;i++) 
		{
			al.add(sc.next());
		}
		
		System.out.println(al);
		System.out.println("Enter postion ");
	       int pos=sc.nextInt();
	//	System.out.println("Enter Element");
		//String el=sc.next();]
		
		if(pos<=5)
		{
			System.out.println(" Enter Element");
		al.add(pos,sc.next());
		//al.add(pos,el);
		System.out.println(al);
		}
		
		else
		
		System.out.println("postion is rong ");
	}

}
