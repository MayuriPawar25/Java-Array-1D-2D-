import java.util.*;
public class PrefixMaxSubarray
{
	public static void maxSubSum(int arr[])
	{
		int maxSum=Integer.MIN_VALUE;
		int currSum=0;
		int prefix[]=new int[arr.length];
		prefix[0]=arr[0];

		//calculate prefix
		for(int i=1; i<prefix.length; i++)
		{
			prefix[i]=prefix[i-1]+arr[i];
		}

		for(int i=0; i<arr.length; i++)
		{
			int start=i;
			for(int j=i; j<arr.length; j++)
			{
				int end=j;
				
				currSum=0;
				if(start==0)
				{
					currSum=prefix[end];
				}
				else
				{
					currSum= prefix[end]-prefix[start-1];
				}
				 //currSum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];
				/*System.out.println(arr[start]);
				 for(int k=start; k<=end; k++) //if you akip this loop then there will be 2 loop n time complexity will be O(n^2)
				 {
				 	System.out.print(arr[k]+ " ");
					
				 }
				System.out.println(" = "+ currSum);*/
				if(currSum>maxSum)
				{
					maxSum=currSum;
				}   
			}
				

		}
		System.out.println(" Maximum Sum= "+ maxSum);
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
		maxSubSum(arr);
	}
}