package inteviewProgram;

import java.util.HashSet;
import java.util.Set;

public class NoDuplicateChar {

	public static void main(String[] args) {
		Set set = new HashSet();
	   String s = "papatpa";
	   char [] a =s.toCharArray();
      for (int i = 0; i <a.length; i++) {
		for (int j = i+1; j <a.length; j++) {
			if (a[i]==a[j]) {
			      a[j]=' ';
			}
		}
		
	}    

	}

}
