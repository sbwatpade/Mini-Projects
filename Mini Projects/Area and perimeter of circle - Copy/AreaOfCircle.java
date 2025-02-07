import java.util.Scanner;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		final float pi = 22/7;
		Scanner sc= new Scanner(System.in);
		System.out.println("write a value of radius");
		float r = sc.nextFloat();
			 
		// Area of circle
		float Radius = pi*r*r;
		System.out.println("radius of circle is :"+Radius);
			 
		// perimeter of circle
		double perimeter= pi*2*r;
		System.out.println("perimeter of rectangle is :"+perimeter);
	}
}
