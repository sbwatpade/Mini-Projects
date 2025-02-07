 import java.util.Scanner;
class PoundtoKg 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the pound");
		float pound=sc.nextFloat();
		double kg=pound*(0.454);
		System.out.println("the "+pound+"pound is "+kg+" kilogram");
	}
}
