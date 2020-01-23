package array;

public class sorting {

	public static void main(String[] args) throws Exception {
		int temp;
		int a[]=new int[4];
		a[0]=20;
		a[1]=30;
		a[2]=40;
		a[3]=100000;
		a[4]=100;
		a[5]=105;
		a[6]=1000;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
	}

}
