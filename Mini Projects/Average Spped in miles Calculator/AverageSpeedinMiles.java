import java.util.Scanner;
class AverageSpeedinMiles 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the distance in kilometer :");
		int distance = sc.nextInt();
		System.out.println(" the distance he run in kilometer is:"+distance);
		double miles= distance/1.6;
		System.out.println(" the distance he run in miles is:"+miles);
		
		// System.out.println("enter the time taken to complete the race (in minute)");
		//int time=sc.nextInt();
		float seconds=(60*45)+30; // +30 i taken if there is condition that include half minute too means extra 30 second
		System.out.println("the time taken to complete the race is :"+(seconds/3600));
		
		// average speed in miles per four
		double avg= miles/(seconds/3600);
		System.out.println("the average speed in miles per hour is :"+avg);
		
	}
}
