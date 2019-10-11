package inteviewProgram;

public class B extends A{
	
	public B(int l) {
		super(l);
		System.out.println("b");
	}
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
	 B b = new B(5);
	 b.m2();
}

}
