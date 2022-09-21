package Practice;

import java.util.Scanner;

public class TwoDimensionalArray 
{
public static void main(String[] args) 
{
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the Number of Rows");
	int Rows=s.nextInt();
	
	System.out.println("Enter the Number of Columns"); 
	int Columns=s.nextInt();
	
String [] [] a=new String [Rows] [Columns];

	for (int i = 0; i < Rows; i++) 
	{
		for (int j = 0; j < Columns; j++) 
		{
			a[i][j]=s.next();
		}
	}
	System.out.println("___________________");
	for (int i = 0; i < Rows; i++) 
	{
		for (int j = 0; j < Columns; j++) 
		{
			System.out.println(a[i][j]);
		}
	}
}
}
