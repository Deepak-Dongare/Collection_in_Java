package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class HW19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first  ArrayList Element");
		for(int i=0;i<5;i++) {
			
			al.add(sc.next());
		}
		
		ArrayList all=new ArrayList();
		System.out.println("Enter second ArrayList Element");
		for(int i=0;i<5;i++) {
			
			all.add(sc.next());
		}
		
	//	ArrayList al3= new ArrayList();
     //   for (int temp :al)
            all.add(all.contains(al) ? "Yes" : "No");
        System.out.println(all);

	}

}
