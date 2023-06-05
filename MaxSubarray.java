//Brute Force
import java.util.*;
public class MaxSubarray
{
	public static void maxsub(int arr[])
	{
		int maxSum=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			int start=i;
			int sum=0;
			for(int j=i; j<arr.length; j++)
			{
				int end=j;
				int currSum=0;
	
				for(int k=start; k<=end; k++)
				{
					System.out.print(arr[k]+" ");
					currSum+=arr[k];
				}
				System.out.println(" = "+currSum);
				if(currSum>maxSum)
				{
					maxSum=currSum;
				}
				System.out.println();
			}
		}
		System.out.println("Maximum Sum array: "+ maxSum);
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
		maxsub(arr);
	}
}