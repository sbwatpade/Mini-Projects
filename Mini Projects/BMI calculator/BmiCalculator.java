import java.util.Scanner;
class BmiCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your weight");
		double weight=sc.nextDouble();
		
		System.out.println("enter your height");
		double height=sc.nextDouble();
		
		double pound=weight*0.45359237;
		double inches=height*0.0254;
		
		double bmi=pound/(inches*inches);
		
		
		System.out.println("bmi is"+bmi);
	}
}
