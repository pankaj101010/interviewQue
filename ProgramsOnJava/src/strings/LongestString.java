package strings;

public class LongestString {
	public static String m1(String[] a) {
		
		String s ="";
		s.getClass();
		if (a.length==1) {
			return a[0];
		}
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j <a.length; j++) {
				if (a[i].length()>=a[j].length()) {
					s = a[i];
				}
			}
		}
		if (s.length()<a[a.length-1].length()) {
			return a[a.length-1];
		}
		return s;
	}
	public static void main(String[] args) {
		String [] a= {"ab","a","asc","rs","pankaj","asb","sandiprao","abskjsdfjabh"};
		System.out.println(m1(a));
	}
}
