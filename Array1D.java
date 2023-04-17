import java.util.*;
public class Array1D 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int size= sc.nextInt();

		int Marks[]=new int[size];

		System.out.print("Enter the marks of the Students: ");
		for(int i=0;i<size;i++)
		{
			Marks[i]=sc.nextInt();
		}

		System.out.println("Marks of the Students: ");
		for(int i=0;i<size;i++)
		{
			System.out.println(Marks[i]);
		}

		System.out.print("Enter the marks to be searched with its indexed no: ");
		int s = sc.nextInt();

		for(int i=0; i< Marks.length;i++)
		{
			if(Marks[i]==s)
			{
				System.out.print("Indexed no of searched no is "+ i);
			}
		}
	}
}