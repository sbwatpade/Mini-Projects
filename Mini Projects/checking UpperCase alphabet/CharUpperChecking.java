import java.util.Scanner;
class CharUpperChecking 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the char to check is it a uppercase or not");
		char ch=sc.next().charAt(0);
		
		String upper=(ch>='A' && ch<='Z')?("its a Upper case char"):("Its not upper case character");
		System.out.println(upper);
	}
}
 
