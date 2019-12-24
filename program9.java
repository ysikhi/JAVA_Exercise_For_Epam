import java.util.*;
public class program9 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		int m = 0,k = 0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==6)
			{
				m=i;
			}
			if(a[i]==7)
			{
				k=i;
			}
		}
		System.out.println(m+" "+k);
		int sum=0;
		if(m<k||m==0||k==0)
		{
		for(int i=0;i<n;i++)
		{
			if(m==0||k==0)
			{
				sum=sum+a[i];
			}
			else if(i<m||i>k)
			{
				sum=sum+a[i];
				//System.out.println(sum);

			}
		}
		}
		System.out.println(sum);
	}
}
