package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		//=sc.nextInt();
	
		ArrayList al=new ArrayList();
		System.out.println("Enter ArrayList Element");
		
		for(int i=0;i<5;i++)
		{
			
			al.add(sc.next());
		}
		
		System.out.println("Enter you want to check");
		//=sc.next();
		if(al.contains(sc.next())) {
			
			System.out.println("Element presnt");
		}
		System.out.println("Element not presentt'");
	}
	

}
