package inteviewProgram;

public class ExceptionHandle {

	public static void main(String[] args) {
		try {
			//int i =10/0;
			throw new ArithmeticException("pankaj");
			//int i=10/0;
		}catch(NullPointerException r) {
			System.out.println(r.getMessage());
		}
		catch(ArithmeticException w) {
			System.out.println(w.getLocalizedMessage());
		}
		catch(Exception r) {
			
		}

	}

}
