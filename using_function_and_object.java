//Write a program by using class and object.
//First class do the process of sum of digit and fibonacci series
//Second class use the method of first class.

package object_method;

import java.util.Scanner;

public class using_function_and_object {
	
	public static void sum_of_digits() {
		int n,res,sum=0;
		System.out.println( " please enter the numbres:  ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		do  
		{
			res=n%10; 
			sum=sum+res;  
			n=n/10;       
		}
		while( n>0);
		System.out.println("The sum of digits is = "+sum);

	}
	  public static void fib() 
      { 
    	  int i,n=0,n1=1,n2,c=10;
    	  System.out.println("n is  = "+n);
    	  System.out.println("n1 is = "+n1);
    	  
    	  for( i=2;i<c;i++) 
        {
    		  n2=n+n1; 
    		  System.out.println("n2 = "+n2);  
    		  n=n1;
    		  n1=n2;
    		  }
  	   
      }
      	
}