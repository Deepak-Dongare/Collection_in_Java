package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HW18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ArrayList");
		
		for(int i=0;i<5;i++) {
			
			al.add(sc.next());
		} 
		ArrayList all=new ArrayList();
		//System.out.println(all.addAll(al));
		
		//System.out.println(all);
		System.out.println("Enter array");
		for(int i=0;i<5;i++) {
			
			all.add(sc.next());
		}
		Collections.copy(al,all);
		
		System.out.println(al);
		
		
		System.out.println(all);
		
	}

}
