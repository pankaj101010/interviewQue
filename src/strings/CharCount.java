package strings;

public class CharCount {

	public static void main(String[] args) {
		String str = "pankajpankaj";
		/*
		char[] res = str.toCharArray();
		Arrays.sort(res);
		ArrayList<Character> A = new ArrayList<Character>();
		for (int i = 0; i < res.length; i++) {
			A.add(res[i]);
		}
		A.add(null);
		int count = 0;
		for (int i = 0; i < A.size() - 1; i++) {
			if (A.get(i) == A.get(i + 1)) {
				count++;
			} else {
				count += 1;
				System.out.println("Occurence of " + A.get(i) + " is " + count);
				count = 0;
			}
		}
		*/
		String val = "sankaj";
		for (int i = 0; i < val.length(); i++) {
			if (str.contains(val)) {
				System.out.println("count");
			}
		}
	}

}
