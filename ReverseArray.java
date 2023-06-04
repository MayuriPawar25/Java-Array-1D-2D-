//time complexity O(n^2)
import java.util.*;
public class ReverseArray
{
	public static void reverse(int arr[])
	{
		int totalpairs=0;
		for(int i=0; i<arr.length; i++)
		{
			int curr=arr[i];
			for(int j=i+1; j<arr.length; j++)
			{
				System.out.print("( "+curr+ ","+arr[j]+" )");
				totalpairs++;
			}
			System.out.println();
		}
		System.out.println("Total pairs: "+totalpairs);  //n(n-1)/2

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

		reverse(arr); 	
	}
}