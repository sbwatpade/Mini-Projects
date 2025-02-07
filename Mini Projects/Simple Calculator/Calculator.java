import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter num1");
		float num1=sc.nextFloat();
		
		System.out.println("enter num2");
		float num2=sc.nextFloat();
		
		System.out.println("which operation you want to do (+)/(-)/(*)/(/)");
		char op=sc.next().charAt(0);
		
		double opt = (op=='+')?(num1+num2):
			((op=='-')?(num1-num2):
			((op=='*')?(num1*num2):
			((op=='/')?(num1/num2):
			((op=='%')?(num1%num2):(0.0)))));
		
		String output = num1+" "+op+" "+num2+" ="+opt;
		
		if (!(opt==0.0))
		{
			System.out.println("the answer is "+output);
		}
		 
	}
}
