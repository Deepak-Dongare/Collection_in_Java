package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CW7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<50;i++) {
			
			al.add(i);
			  
		}
		
		Iterator iterator=al. iterator();
		
		while(iterator.hasNext()) {
			
			int i=(int) iterator.next();
			
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
				
				
	}

}
