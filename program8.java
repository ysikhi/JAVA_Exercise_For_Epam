import java.util.*;
public class program8 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=0;
		int[] a = new int[n];
		int[] h = new int[1000000];
		for (int i = 0; i < h.length; i++) {
		    h[i] = m;
		}
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			
			h[a[i]]++;
		}
		sc.close();
		int max=h[0];
		int j=0;
		for(int i=0;i<h.length;i++)
		{
			if(max<h[i])
			{
				max=h[i];
				j=i;
			}
		}
		System.out.println(j);
		/*for(int i=0;i<h.length;i++)
		{
			System.out.println(h[i]);
		}*/
	}
}
