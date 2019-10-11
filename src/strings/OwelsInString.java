package strings;

import org.openqa.selenium.support.PageFactory;

public class OwelsInString {
	public static void main(String[] args) {
       String name = "pankaj";
       name = name.toLowerCase();
       String name2="aeiou";
       for (int i = 0; i <name.length(); i++) {
		for (int j = 0; j < name2.length(); j++) {
			if (name.charAt(i)==name2.charAt(j)) {
				System.out.print(name.charAt(i));
			}
		}
	}
	} 
}
