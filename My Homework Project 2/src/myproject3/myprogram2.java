package myproject3;

import java.util.Scanner;

public class myprogram2 {

	public static void main(String[] args) {
		//Variable declaration
      int[] data = new int[5];
      Scanner obj = new Scanner(System.in);
      int sum=0,avg;
      //Read the numbers from users
      for(int i=0;i<5;i++)
      {
    	  System.out.println("Enter the number:");
    	  data[i]=obj.nextInt();
      }
      for(int d:data)
    	  sum+=d;
      
      avg=sum/5;
      System.out.println(sum);
      System.out.println(avg);
      
	}

}
