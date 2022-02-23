package myproject4;

import java.util.Scanner;

public class MyHomeWork3 {

	public static void main(String[] args) {
		//Read the numbers from user
		int[] data = new int[5];
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<data.length;i++)
		{
			
			System.out.println("Enter the number");
			data[i]=obj.nextInt();
		}
      int temp=data[0];
      
      for(int d:data)
      {
    	  if(d>temp)
    		  temp=d;
      }
      System.out.println("Biggest number:"+temp);
	}

}
