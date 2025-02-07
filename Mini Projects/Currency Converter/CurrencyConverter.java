import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("    WELCOME TO CURRENCY CONVERTER ");
		System.out.println("");
		System.out.println("");
		System.out.print("Enter your amount in INR :");
		float inr=sc.nextFloat();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("THE LIST OF CURRENCY");
		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("3.GBP");
		System.out.println("4.PKR");
		
		String curr=sc.next().toUpperCase();
		
		float currencyConverter=0;
		if (curr.equals("USD"))
		{
			currencyConverter=curr*(0.012f);
			System.out.println(inr+" INR = "+currencyConverter+" INR");
		}
		else if (curr.equals("EUR"))
		{
			currencyConverter=curr*(0.01107545f);
						System.out.println(inr+" INR = "+currencyConverter+" INR");
		}
		else if (curr.equals("GBP"))
		{
			currencyConverter=curr*(0.00928990275f);
						System.out.println(inr+" INR = "+currencyConverter+" INR");
		}
		else if (curr.equals("PKR"))
		{
			currencyConverter=curr*(3.2199707f);
						System.out.println(inr+" INR = "+currencyConverter+" INR");
		}
		else
		{
			System.out.println("INVALID OPTION");
		}
	}
}
