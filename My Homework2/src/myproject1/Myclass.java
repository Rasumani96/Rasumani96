package myproject1;

import java.util.Scanner;

public class Myclass {

	public static void main(String[] args) {
		int[] data = new int[5];
		Scanner obj = new Scanner(System.in);
		
		//Read the numbers from users
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the number");
			data[i]= obj.nextInt();
		}
		//Print the numbers using for loop
		for(int i=0;i<5;i++)
		{
			System.out.println(data[i]);
		}
		
	}

}
