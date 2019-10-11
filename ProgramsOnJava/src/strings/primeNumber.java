package strings;

public class primeNumber {

	public static void main(String[] args) {
		  int num = 17;
		 /* 
		for (int i = 2; i <=num; i++) {
			for (int j = 2; j <=i; j++) {
			if (i==j) {
				System.out.println("number is prime : "+i);
			}
			if (i%j==0) {
				break;
			}
		}	
		}
	*/
		  for (int i = 2; i <=num; i++) {
			  if (num==i) {
				System.out.println("number is prime number");
				break;
			}
			if (num%i==0) {
				System.out.println("number is not a prime number");
				break;
			}
			
		}
	}

}
