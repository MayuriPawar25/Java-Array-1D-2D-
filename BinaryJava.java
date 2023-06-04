import java.util.*;
public class BinaryJava
{
	public static int search(int arr[], int sr)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			//comparisons
			if(arr[sr]==mid)
			{
				return mid;
			}
			if(arr[sr]<mid)
			{
				//left part
			    end=mid-1;
			}
			else if(arr[sr]>mid)
			{
				start=mid+1;
			}
		}
		return -1;
		
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
		System.out.println("Search element: ");
		int sr=sc.nextInt();

		System.out.println("Index for key is: "+ search(arr,sr));
		
	}
}