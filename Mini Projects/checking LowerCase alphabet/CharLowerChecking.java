import java.util.Scanner;
class CharLowerChecking 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the char to check is it a lowercase or not");
		char ch=sc.next().charAt(0);
		
		String upper=(ch>='a' && ch<='z')?("its a lower case char"):("Its not lower case character");
		System.out.println(upper);
	}
}
