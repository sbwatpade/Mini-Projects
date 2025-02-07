// for four digit

import java.util.Scanner;
class SumEv 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the four digit number");
		int num=sc.nextInt();
		int evenSum=0;
		int oddSum=0; 
		 
		 
		//step 1 
	    int rem=num%10; // to extract last number
		int ans = (num%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		
		//step 2
		num = num/10; // to remove last digit
		rem = num%10;
		ans = (num%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		
		//step 3
		num = num/10;
		rem = num%10;
		ans = (num%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		
		//step 4
		num = num/10;
		rem = num%10;
		ans = (num%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		
	
		System.out.println("Even Sum Is "+evenSum);
		System.out.println("Odd Sum Is "+oddSum);
	}
}
