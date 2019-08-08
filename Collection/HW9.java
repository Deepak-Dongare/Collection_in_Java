package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class HW9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Element");
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		for(int i=0;i<5;i++) {
			
		al.add(sc.next());
		
		}
		
		if(al.isEmpty()) {
			System.out.println("Collection is empty");
		}
		else {
			
			System.out.println("Collection is not empty");
		}

	}

}
