import java.util.*;
public class LinSearch
{
	public static int search(int arr[], int search)
	{
		
		for(int i=0; i<arr.length; i++)
		{
			if(search == arr[i])
			{
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();

		int arr[]=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter element to search");
		int search=sc.nextInt();

		int index= search(arr, search);
		if(index==-1)
		{
			System.out.println("Not Found");
		}
		else
		{
			System.out.println("Found "+index);
		}
	}
}