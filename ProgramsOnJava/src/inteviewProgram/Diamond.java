package inteviewProgram;

public class Diamond {

	public static void main(String[] args) {
		try {
		int lines = 7;
		} 
		catch(ArithmeticException e){
			
		}
        catch(Exception e) {
			
		}
		
		C c = (int y)-> System.out.println(3*y); 
		c.write(9);
		new Thread(//new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("this is runnable object");
//				
//			}
//			
//		}
		()-> {System.out.println("hi");}).start();
	}

}
