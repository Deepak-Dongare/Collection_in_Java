package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HW38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<50;i++) {
			
			al.add(i);
			  
		}
		
		
		
		System.out.println(al);
		
		System.out.println(al.subList(20, 30));
				
	}

}
