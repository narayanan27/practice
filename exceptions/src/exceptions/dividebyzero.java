package exceptions;

public class dividebyzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("A");
		
			System.out.println("A1");
			int i=8/0;
			System.out.println(i);
			}
		catch(Exception e)
		{ System.out.println("Error message "+e.getMessage());
			
		}
		finally {
			System.out.println("error in try block");
			
		}
		}

}
