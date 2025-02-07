class Census 
{
	public static void main(String[] args) 
	{
		final long currentpopulation = 312032486;
		final long seconds= (365*24*60*60)*5; //*5 is for five years
		long birth= seconds/7;
		long death= seconds/13;
		long immigrant= seconds/45;
		
		System.out.println("current population is :"+currentpopulation);
		
		long newpopulation= (currentpopulation+birth-death+immigrant);
		
		System.out.println("population after 5 years is :"+newpopulation);
	}
}
