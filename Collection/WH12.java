package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class WH12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al= new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array list element");
		
		for(int i=0;i<5;i++) {
			
			al.add(sc.next());
		}
			
		System.out.println(al);
		
		
	}

}
