import java.util.Scanner;
class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the 3 digit number you want to reverse :");
		long num = sc.nextLong();
		long temp = num;
		long rev=0;
		long i;
		
		/* // reversing for only 3 number
		
		//1st step
		int rem = num%10; // for excluding first two number to take last digit
		rev= rev*10+rem; // formula to reverse 3 digits
		num = num/10; // for excluding last digit of number
		
		
		//2nd step
		rem =num%10; // for excluding first digit
		rev=rev*10+rem; // formula
		num= num/10; // for excluding last digit
		
		//3rd step
		rem=num%10;
		rev = rev*10+rem;
		num = num/10; // for excluding last digit */
		
		for(i=0; i<=num; i++)
		{
		long rem=num%10;
		rev = rev*10+rem;
		num = num/10;
		}
		 
		 System.out.println(temp+ " : "+ rev);
		
	}
}
