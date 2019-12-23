import java.util.*;
public class program2 
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
		Arrays.sort(a);
		System.out.println("Maximum number is :"+a[n-1]);
		System.out.println("Minmum number is :"+a[0]);
		
	}
}
