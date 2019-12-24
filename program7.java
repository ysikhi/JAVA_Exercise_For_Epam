import java.util.*;
public class program7 
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
		//Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
