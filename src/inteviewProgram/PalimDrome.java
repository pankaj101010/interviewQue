package inteviewProgram;

public class PalimDrome {

	public static void main(String[] args) {
		 String name ="panap";
		 char[] a = {'a','d','i','n','a','t','h'};
		 String na = new String(a);
		 System.out.println(na);
		 String tmp ="";
		 for (int i =name.length()-1;i>=0; i--) {
			 tmp+= name.charAt(i);
		}
		 if (tmp.equals(name)) {
			System.out.println("palinDrome");
		}
		 else {
			 System.out.println("not");
		 }

	}

}
