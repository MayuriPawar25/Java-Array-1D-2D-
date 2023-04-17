//2Dimensional Array
import java.util.*;
public class Array2D
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the rows: ");
		int rows=sc.nextInt();
		System.out.print("Enter the size of the columns: ");
		int cols = sc.nextInt();

		int TwoD[][]=new int[rows][cols];

		System.out.print("Enter the elements of Array: ");
		//rows
		for(int i=0;i<rows;i++)
		{	//columns
			for(int j=0;j<cols;j++)
			{
				TwoD[i][j]=sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("Printing 2D Array: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(TwoD[i][j]);
			}
			System.out.println();
		}

		System.out.println("Enter the number to know the location in the above matrix: ");
		int s=sc.nextInt();
		for(int i=0; i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(TwoD[i][j]==s)
				{
					System.out.println("Number found at ("+ i + " , " + j + ") location");
				}
			}

		}
	}
}