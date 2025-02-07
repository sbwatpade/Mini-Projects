import java.util.Scanner;
class Celsius 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the current degree in celsius :");
		double celsius=sc.nextDouble();
		
		// conversion of celsius to Fahrenheit
		double fahrenheit=(9.0/5)*celsius+32; //.0 must follwed by number when we using double type of variable for calculation  
		System.out.println("the convertsion of "+celsius+" into Fahrenhiet is :"+ fahrenheit);
	}
}
