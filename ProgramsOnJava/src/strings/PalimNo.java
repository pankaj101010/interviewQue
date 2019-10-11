package strings;

import org.testng.annotations.Test;

public class PalimNo {
  @Test
  public void ts_01() {
	  int i =101;
	  int val =i;
	  int temp=0;
	  int sum=0;
	  while(i>0) {
		  temp=i%10;
		   i=i/10;
		  sum=sum*10+temp; 
	  }
	  System.out.println(sum);
	  if (val==sum) {
		System.out.println("palimNo");
	}
  }

}
