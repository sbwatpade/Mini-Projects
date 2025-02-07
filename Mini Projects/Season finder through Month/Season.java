import java.util.Scanner;
class Season
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month");
		String month=sc.next();
	
		String season=(month.equals("jan") ||month.equals("oct") ||month.equals("nov") ||month.equals("dec") )?("season is WINTER"):((month.equals("feb") ||month.equals("mar") ||month.equals("apr") ||month.equals("may") )?("season is SUMMER"):((month.equals("jun") ||month.equals("jul") ||month.equals("aug") ||month.equals("sep"))?("season is MANSOON"):("")));
		System.out.println(season);
	}
}
