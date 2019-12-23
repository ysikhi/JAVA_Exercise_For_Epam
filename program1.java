import java.util.*;
public class program1 
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		sc.close();
		System.out.println("Sum of the array is:"+sum);
		System.out.println("Average of the array is:"+sum/n);
	}
}
