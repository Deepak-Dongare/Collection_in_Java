package Collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class HW10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			
			al.add(sc.next());
			
			
		}
		
		System.out.println(al); 
			Object[] a	=al.toArray();
			
			for(Object array :a) {
				
				System.out.print("  "+ array);
			}
	}

}
