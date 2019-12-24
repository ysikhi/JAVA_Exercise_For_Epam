import java.util.Scanner;
public class program11 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		if(a.length==9)
		{
			System.out.println("The given array is:");
			for(int i=0;i<a.length/3;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
			for(int i=a.length/3;i<a.length-3;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
			for(int i=a.length-3;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
			System.out.println("The reverse of the array is:");
			for(int i=a.length-1;i>=a.length-3;i--)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
			for(int i=a.length-3-1;i>=a.length-6;i--)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
			for(int i=a.length-6-1;i>=0;i--)
			{
				System.out.print(a[i]+" ");
			}
			
		}
		else
		{
			System.out.println("Please enter 9 integer numbers");
		}
	}
}
