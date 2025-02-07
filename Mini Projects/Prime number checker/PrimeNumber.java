import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		
		String prime=(num==2 || num==3)?("Number is a prime"):((num%2==0 || num%3==0)?("number is not prime"):("number is prime"));
		System.out.println(prime);
	}
}
