import java.util.Scanner;
class SumofDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the four digit");
		long num=sc.nextInt();
		long sum=0;
		
		// for 4 digits only
		
		// step 1
		long rem=num%10; // to extract last number
		sum= sum+rem; // sum value updation
		num=num/10; // to remove last digit
		
		// step 2
		rem=num%10;
		sum= sum+rem;
		num=num/10;
		
		// step 3
		rem=num%10;
		sum= sum+rem;
		num=num/10;
		
		// step 4
		rem=num%10;
		sum= sum+rem;
		
		
		
		
		
		// for more than 4 digit numbers
		// long i;
		// for(i=0; i<=num;i++)
		// {
	      // long rem=num%10; // to remove digit except last
		  // sum= sum+rem; // sum
		  // num=num/10; // to remove last digit
		// }
		
		
		System.out.println("the sum of digit is "+sum);
	}
}
