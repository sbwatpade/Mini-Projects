 import java.util.Scanner;
class TipCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the subtotal");
		float subtotal=sc.nextFloat();
		System.out.println("enter the tip percentage of amount");
		float tip_per=sc.nextFloat();
		
		float tipamount=(tip_per*subtotal)/100;
		float totalamount=subtotal+tipamount;
		System.out.println("the tip amount is"+tipamount);
		System.out.println("the grand amount is"+totalamount);
	}
}
