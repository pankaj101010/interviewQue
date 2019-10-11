package strings;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String s = "pankaj sandip pankaj shashank pankaj mayur pankaj pankaj";
		s= s.toLowerCase();
		String [] dup = s.split(" ");
		int count =1;
		for (int i = 0; i < dup.length-1; i++) {
			for (int j = i+1; j < dup.length; j++) {
				if (dup[i].equals(dup[j])) {
					 count = count+1;
					 dup[j] ="";
				}
			}
		}	
			for (int j=0 ; j<dup.length;j++) {
				if (dup[j].equals("")) {
					continue;
				}
				else {
					System.out.print(dup[j]+" ");
				}
			}
		}
}
