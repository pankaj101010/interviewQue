package strings;

public class OccuranceOfChar {

	public static void main(String[] args) {
		String name ="pankajaaaaaaaaaaaaaaaaaaa";
		char n = 'a';
	 int count=0;
		for (int i = 0; i <name.length(); i++) {
			if (n==name.charAt(i)) {
				count+=1;
			}
		}
        System.out.print(count);
	}

}
