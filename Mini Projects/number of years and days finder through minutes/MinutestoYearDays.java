import java.util.Scanner;
class MinutetoYearDays 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the minutes");
		long minutes=sc.nextLong();
		
		
		// long rem= (minutes/(year*365*24*60));
		// long days= (rem-(365*24*60));
		
		long year=(minutes/(365*24*60));
		long totaldays=(minutes/(24*60));
		long days= totaldays%365;
		System.out.println("the years are :"+year+" the days are "+days);
	}
}
