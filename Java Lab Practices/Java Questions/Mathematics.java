package com.Meenu;

import java.util.*;

public class Mathematics {

	public static void main(String[] args) {
	  	

	}
	// factorial
	
	public static int factorial(int number) {
		int temp=1;
		if(number==0) {
			temp=1;
		}
		else {
		for(int i=1;i<=number;i++) {
			temp*=i;
		}}	
		return temp;
	}
	
	//average
	
	public static double average(int n) {
		Scanner input=new Scanner(System.in);
		float temp=0;
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the number "+i+" :");
			temp+=input.nextInt();
		}
		return (temp/n);
	}
	
	//reverse
	
	public static int reverse(int n1) {
		int number=n1;
		String temp="";
		while(number!=0) {
			temp+=Integer.toString(number%10);
			number/=10;
		}
		return (Integer.parseInt(temp));
	}
	
	//armstrong
	
	public static String armstrong(int n2) {
		int number1=n2;
		int length=(Integer.toString(n2)).length();
		int temp1=0;
		String output="";
		while(number1!=0) {
			System.out.println(number1);
			temp1+=(Math.pow(number1%10, length));
			System.out.println(temp1);
			number1/=10;
		}
		if(temp1==n2) {
			output="Armstrong number";
		}
		else if(temp1!=n2){
			output="Not an armstrong number";
		}
		return (output);
		
	}
	
	//fibanocci series
	
	public static void fib(int no) {
		int no1=0,no2=1,no3;
		if(no>=1) 
		{
			if(no==1) {
				System.out.println(no1);
			}
			else if(no==2) {
				System.out.println(no1+" "+no2);
			}
			else if(no>2) {
				System.out.println(no1+" "+no2);
				for(int i=2;i<no;i++) {
					no3=no1+no2;
					System.out.println(" "+no3);
					no1=no2;
					no2=no3;
				}
			}
		
		}
	}
	
	//prime number 
	
	public static void prime(int num){ 
	    int temp;
	    boolean isPrime=true;
	    
		for(int i=2;i<=num/2;i++)
		{
	       temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	   }
	
	//perfect number
	
	public static void perfect(int n)    
	{  
	int sum=0,i=1;    
	
	while(i <= n/2)  
	{  
	  if(n % i == 0)  
	  {   
	   sum+=i;  
	  } 
	  i++;  
	}  
	  System.out.println(sum);
	  if(sum==n)  
	  {  
	   System.out.println(n+" is a perfect number.");  
	  } 
	  else  
	   {  
	   System.out.println(n+" is not a perfect number.");   
	   }	
	}
	
	//strong number
	
	public static void strong(int number) {
		int temp=0,tno=number;
		while(number!=0 && number>0) {
			int fact=1;
			for(int i=1;i<=(number%10);i++) {
				fact*=i;
			}
			temp+=fact;
			System.out.println(temp);
			number/=10;
		}
		System.out.println(temp);
		if(temp==tno) {
			System.out.println(tno+" is a strong number");
		}
		else {
			System.out.println(tno+" is not a strong number");
		}
	}
	
}
