import java.util.Scanner;
class EVM 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int bjp=0, ss=0, rsp=0, mns=0, cng=0, nota=0;
		System.out.println("");
		System.out.println("        *** WELCOM TO EVM ***");
		System.out.println("");
		
		System.out.print("ENTER THE POPULATION :");
		int population=sc.nextInt();
		
		for (int i=1; i<=population; i++)
		{
			System.out.println("");
			System.out.println("        NAME OF PARTIES");
			System.out.println("");
			System.out.println("        1. BJP");
			System.out.println("        2. SHIVSENA");
			System.out.println("        3. RSP");
			System.out.println("        4. MNS");
			System.out.println("        5. CONGRESS");
			System.out.println("        6. NOTA");
			System.out.println("");
			System.out.print("ENTER THE OPTION :");
			int opt=sc.nextInt();
			
			if (opt==1)
			{
				bjp++;
				System.out.println("you have voted for bjp");
			}
			
			if (opt==2)
			{
				ss++;
				System.out.println("you have voted for SHIVSENA");
			}
			
			if (opt==3)
			{
				rsp++;
				System.out.println("you have voted for RSP");
			}
			
			if (opt==4)
			{
				mns++;
				System.out.println("you have voted for MNS");
			}
			
			if (opt==5)
			{
				cng++;
				System.out.println("you have voted for CONGRESS");
			}
			if (opt==6)
			{
				nota++;
				System.out.println("you have voted for NOTA");
			}
			
			if (!(opt>=1 && opt<=6))
			{
				i--;
				System.out.println("Invalid option");
			}
		}
		
		if (bjp>=cng && bjp>=ss && bjp>=mns && bjp>=rsp && bjp>=nota)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("*** BJP has won the election with "+bjp+" votes***");
		}
		
		if (ss>=cng && ss>=bjp && ss>=mns && ss>=rsp && ss>=nota)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("*** Shivsena has won the election with "+ss+" votes***");
		}
		
		if (cng>=bjp && cng>=ss  && cng>=mns && cng>=rsp && cng>=nota)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("*** CONGRESS has won the election with "+cng+" votes***");
		}
		
		if (mns>=cng && mns>=ss  && mns>=bjp && mns>=rsp && mns>=nota)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("*** MNS has won the election with "+mns+ " votes***");
		}
		
		if (rsp>=cng && rsp>=ss  && rsp>= mns && rsp>=bjp && rsp>=nota)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println(" *** RSP has won the election with "+rsp +" votes***");
		}
		
		if (nota>=cng && nota>=ss && nota>=mns && nota>=bjp)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("");
	
			System.out.println("*** NOTA has won the election with "+nota+" votes***");
		}
	}
}
