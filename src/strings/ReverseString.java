package strings;

public class ReverseString {

	public static void main(String[] args) {
		String name = "pankaj vasant devgade";
		String[] name2 = name.split(" ");
		for (int i = name2.length-1; i >=0; i--) {
			   System.out.print(name2[i]+" ");
		}

	}

}
