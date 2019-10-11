package strings;

public class FindDuplicateFromString {

	public static void main(String[] args) {
		String s = "pankaj sandip pankaj sandip prakash pankaj sandip pankaj sanket sanket";
		 String[] dup = s.split(" ");
		 int count = 1;
		 for (int i = 0; i < dup.length-1; i++) {
			 for (int j = i+1; j < dup.length; j++) {
				if (dup[i].equals(dup[j])) {
					count = count+1;
				      dup[j]="";
				}
			}
			 if (dup[i]=="") {
				 
			}else if (count>1){
			 System.out.println(dup[i]+": "+count);
			}
			 count=1;
		}
//		 for (String string : dup) {
//			System.out.print(string+" ");
//		}
	}

}
