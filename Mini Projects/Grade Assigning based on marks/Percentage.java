import java.util.Scanner;
class Percentage 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int marks=sc.nextInt();
		System.out.println("total marks of exam");
		int outof=sc.nextInt();
		
		float per=((marks*100)/outof);
		
		// String passfail= (per>=35)?("pass"):("fail");
		String passfail=(per>=75&&per<=100)?("A GRADE with "+per"%"):((per>=60&&per<=70)?("B GRADE with "+per"%"):((per>=35)?("C"):("fail")));
		System.out.println(passfail);
	}
}
