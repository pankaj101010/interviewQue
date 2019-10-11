package strings;

import org.testng.annotations.Test;

public class UnicodeofString {
	@Test
     public void test_01() {
    	 String name="pankaaaj";
    	 String name2 ="pratikpm";
    	 String  count="";
    	 
    	for (int i = 0; i <name.length(); i++) {
    if(name2.contains(Character.toString(name.charAt(i)))) {
    	System.out.print(name.join("-", Character.toString(name.charAt(i))));
    }
		}
    	
    	//System.out.println(count);
    	 System.out.println(name.contains("a"));
		System.out.println(name.compareToIgnoreCase(name2));
		
		
    	
     }
}
