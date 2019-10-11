package strings;

public class MissingNumber {

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 6, 8, 10 };
		int tp =0;
		for (int i = 0; i < a.length-1; i++) {
					if (a[i]-a[i+1]==1) {		
					}
					else if(a[i]>a[i+1]) {
						tp =a[i]-a[i+1];
					}
					else if(a[i]<a[i+1]) {
						tp =a[i+1]-a[i];
					}
					for (int j = 1; j <tp; j++) {
						System.out.println("ms num "+ ++a[i]);
					}		//System.out.println();
		}
	}

}
