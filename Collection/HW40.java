
package Collection;

import java.util.*;
public class HW40 {
  public static void main(String[] args) {
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Green");
  list_Strings.add("Orange");
  list_Strings.add("White");
  list_Strings.add("Black");
  System.out.println(list_Strings);
//  System.out.println(list_Strings.removeAll(list_Strings));
  
    Collections.shuffle(list_Strings);
	
  
    System.out.println(list_Strings);
 }
}