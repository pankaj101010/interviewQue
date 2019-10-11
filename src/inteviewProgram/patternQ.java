package inteviewProgram;

public class patternQ {

	public static void main(String[] args) {
		int i =123; int temp =0; int sum=0;
		int  temp1=i;
		 while(i>0) {
			 temp = i%10;
			 i =i/10;
			 sum = sum*10+temp;
		 }
		 if(temp1==sum) {
   System.out.println(sum);
		 }
		 else {
			 System.out.println("Not a palimdrome");
		 }
	}

}
