import java.util.*;
public class PrintSubarray
{
	public static void PrintSubarray(int arr[])
	{
		int totsubarray=0;
		for(int i=0; i<arr.length; i++)
		{
			int start=i;
			int sum=0;
			for(int j=i; j<arr.length; j++)
			{
				int end=j;
				sum+=arr[j];
				for(int k=start; k<=end; k++)
				{
					System.out.print(arr[k]+" ");
				}
				totsubarray++;
				System.out.println("  =  "+sum);   //print the sum of subarray
			}
			System.out.println();
		}
		System.out.println("Total Subarrays: "+totsubarray);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Size: ");
		int n=sc.nextInt();

		int arr[]=new int[n];
		System.out.println("Elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		PrintSubarray(arr);
		
	}
}
