package inteviewProgram;

public class DigitTranglePrinting {

	public static void main(String[] args) {
		 int [] a = {23,43,1,3,8,212,98,34};
		 int temp=0;
		 for (int i = 0; i <a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		 
		 System.out.println(a[a.length-1]);
	}

}
