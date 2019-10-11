package strings;

public class fibonacci {
     
	public static void main(String[] args) {
		int val =0; int val2=1; int result=0 ;
		int num =56;
		  while(result<num)
		  {
		     result = val+val2;
			 val = val2;
			 val2 = result;
			 if(result>num) {
				 break;
			 }
			 System.out.print(result+" ");
			 
		  }
		 
	}

}
