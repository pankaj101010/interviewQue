package inteviewProgram;

import org.testng.annotations.Test;

public class Pattern4 {
	@Test()
	public void m1() {
		int lines = 6;
		int count = 1;
		for (int i = 1; i <= lines; i++) {
			 if (i<=lines/2) {
				for (int j = 1; j <=i; j++) {
					System.out.print(count+" ");
					count++;
				}
			}
			 else {
				 for (int j = 1; j <=i; j++) {
					System.out.print("*"+" ");
				}
			 }
		System.out.println();
		}
	}

}
