package Collection;

import java.util.LinkedList;

public class HW50 {

	public static void main(String[] args) {
		
LinkedList ls=new LinkedList();
		
		ls.add("Deepak");
		ls.add("Raj");
		ls.add("Kajal");
		ls.add("Sunil");
		
   LinkedList ls1=new LinkedList();
		
		ls1.add("Deepak");
		ls1.add("Raj");
		ls1.add("Kajal");
		ls1.add("Sunil");
		
		
		System.out.println(ls1.equals(ls));
		
		System.out.println(ls.isEmpty());
		
		ls.set(2, "Dada");
		
		
		System.out.println(ls);
		
		replaceAll(ls);
		System.out.println(ls);
	}

	private static void replaceAll(LinkedList ls) {
		// TODO Auto-generated method stub
		
	}
}
