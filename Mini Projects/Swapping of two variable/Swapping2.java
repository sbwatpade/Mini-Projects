// without using 3rd variable
class Swapping2 
{
	public static void main(String[] args) 
	{
		System.out.println("Before swapping");
		int a=2;
		int b=6;
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		
		System.out.println("After Swapping");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a :"+a);
		System.out.println("b :"+b);		
	}
}
