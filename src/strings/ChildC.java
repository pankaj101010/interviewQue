package strings;

public class ChildC extends ParentC {
     public ChildC() {
    	 System.out.println("child class constructor");
     }
      public void test() {
    	  super.test();
    	  System.out.println("this child class test method");
      }
	public static void main(String[] args) {
		 ChildC cd = new ChildC();
		 cd.test();
	}

}
