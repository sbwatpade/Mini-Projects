class LargestinThree 
{
	public static void main(String[] args) 
	{
		int a=4;
		int b=6;
		int c=8;
		
		int large=(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println("largest numer is :"+large);
	}
}
