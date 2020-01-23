package exceptions;

public class exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
		String a[]=new String[3];
		a[0]="Java";
		a[1]="python";
		a[2]="ruby";
		a[3]="cpp";
		System.out.println("First element is "+a[0]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());}
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			
		}
	}
}

		
		
		
		
	


