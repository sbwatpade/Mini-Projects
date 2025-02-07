import java.util.Scanner;
class ProductofEvOd 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 4 digit number");
		int num=sc.nextInt();
		int evenNum=1;
		int oddNum=1;
		int ans=0;
		
		// step1
		int rem=num%10; // extract last number //4
		ans=(num%2==0)?(evenNum=evenNum*rem):(oddNum=oddNum*rem);
		
		//step2
		num=num/10; //123
		rem=num%10; //3
		ans=(num%2==0)?(evenNum=evenNum*rem):(oddNum=oddNum*rem);
		
		//step3
		num=num/10; //12
		rem=num%10; //2
		ans=(num%2==0)?(evenNum=evenNum*rem):(oddNum=oddNum*rem);
		
		//step4
		num=num/10; //1
		rem=num%10; //1
		ans=(num%2==0)?(evenNum=evenNum*rem):(oddNum=oddNum*rem);
		
		
		System.out.println("product of even : "+evenNum);
		System.out.println("product of odd : "+oddNum);
	}
}
 