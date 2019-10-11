package inteviewProgram;

public class PatternTriangle {
 public static void main(String[] args) {
	int lines = 9;
	for (int i = 1; i <=lines; i++) {
		 for (int j = 1; j <=i ; j++) {
			System.out.print(j);
		}
		 for (int j = 2*lines-i-1; j >=i; j--) {
			System.out.print(" ");
		}
		 for (int j = 1; j <=i ; j++) {
				System.out.print(j);
			}
		 System.out.println();
	}
	
}
} 
