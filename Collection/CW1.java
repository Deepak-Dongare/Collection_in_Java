package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		//int size=al.capacity();
	//	System.out.println(size);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array element");
		for(int i=0;i<5;i++)
		{
			//int a;
		//	String  j=sc.next();
		//	a=i;
			al.add(sc.next());
			
		}
        System.out.println(al);
        
        System.out.println("Enter element at fix postion");
        int pos=sc.nextInt();
        System.out.println("Enter number");
        String  number=sc.next();
        
       
        al.add(pos,number);
        
        System.out.println(al);
	}

}
