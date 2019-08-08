package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class HW8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Element ");
			for(int i=0;i<5;i++) {
				al.add(sc.next());
				
			}
			System.out.println(al);
			ArrayList all=new ArrayList();
			
			System.out.println("Enter Element ");
			for(int i=0;i<5;i++)
			{
				all.add(sc.next());
				
			}
			System.out.println(all);
		
			if(al.equals(all))
			{
				System.out.println("match two collections");
			}
			
			else {
				System.out.println("Not Match");
			}
	}

}
