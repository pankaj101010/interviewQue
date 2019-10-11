package inteviewProgram;

public class VowelsInString {

	public static void main(String[] args) {
		String name = "pankaj VASANT DevgAde";
		  name = name.toLowerCase();
		String vowels ="aeiou";
		System.out.println(name);
		for (int i = 0; i < name.length(); i++) {
			   for (int j = 0; j < vowels.length(); j++) {
				 if (name.charAt(i)==vowels.charAt(j)) {
					System.out.print(name.charAt(i));
				}
			}
		}
		

	}

}
