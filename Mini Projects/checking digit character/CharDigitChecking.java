import java.util.Scanner;
class CharDigitChecking 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the char to check is it a digit or not");
		char ch=sc.next().charAt(0);
		
		String upper=(ch>='0' && ch<='9')?("its a Digit"):("Its not Digit");
		System.out.println(upper);
	}
}
 

