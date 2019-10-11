package inteviewProgram;

public class ReverseString {

	public static void main(String[] args) {
		String name = "pankajz";
		String name1 = "pankaj";
		char s = 'p';
		char [] a = new char[name.length()];
		name.getChars(2, 5, a, 3);
		System.out.println(name.contentEquals(name1));
		System.out.println(a);
		System.out.println(name.compareTo(name1));
		System.out.println(name.startsWith(name1));
		/*
		for (int i = name.length()-1; i >=0; i--) {
			 System.out.print(name.charAt(i));
		}
		System.out.println();
        StringBuffer bf = new StringBuffer(name);
        
          System.out.println(bf.reverse());
         */
	}

}
