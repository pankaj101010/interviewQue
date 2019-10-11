package inteviewProgram;

public class MaxProduct {
 public static void multiply(int [] y) { 
	 int [] p =  new int[2];
	 int temp =0; int temp2=0;
	 for (int i = 0; i<y.length-1; i++) {
		 temp = y[i]*y[i+1];
		 if (temp>temp2) {
			p[0]= y[i];
			p[1]= y[i+1];		
			temp2=temp;
		}
	}
	 
	for (int i : p) {
		System.out.println(i);
	}
	 
 }
	public static void main(String[] args) {
	     int a []= {5,6,4,7,6,3,1,2};
	     
	     		multiply(a);
	}

}
