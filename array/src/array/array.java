package array;

public class array {

	public static void main(String[] args) {
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		String S[]=new String[4];
		S[0]="Kohli";
		S[1]="Rohit";
		S[2]="Dhawan";
		S[3]="Rishab Pant";
		System.out.println("The length of string array is->"+S.length);
		for(int i=0;i<S.length;i++)
		{
			System.out.println(S[i]);
		}
		System.out.println("The length of string array is->"+a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
