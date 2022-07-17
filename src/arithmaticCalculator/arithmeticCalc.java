package arithmaticCalculator;
import java.util.*;

class subtraction
{
	public void subt(Scanner sc)
	{
		double ans = sc.nextDouble();
		while(true)
		{
			sc.hasNextDouble();
			double a = sc.nextInt();
			if(ans<0)
			{
				ans = ans+a;
			}
			else if(ans>0)
			{
				ans = ans-a;
			}
			System.out.println("-----------------");
			
			System.out.println("Answer: "+ans+"\nEnter next number: ");
			System.out.println("E - Exit");
			
			System.out.println("-----------------");
			if(!sc.hasNextDouble())
			{
				arithmeticCalc.main(null);
			}
		}
		
	}
}

class multiplication
{
	public void multi(Scanner sc)
	{
		int ans = 1;
		System.out.println("Start Multiplying: ");
		while(true)
		{
			if(sc.hasNextInt())
			{
				int a = sc.nextInt();
				ans*=a;
				System.out.println("-----------------");
				System.out.println("Answer: "+ans+"\nE - Exit");
				System.out.println("-----------------");
				
			}
			else
			{
				arithmeticCalc.main(null);
			}
		}
	}
}

class addition
{
	public void add(Scanner sc)
	{
		System.out.println("Start Adding: ");
		int ans = 0;
		
		while(true)
		if(sc.hasNextInt())
		{
			
			int a = sc.nextInt();
			ans+=a;
			System.out.println("-----------------");
			System.out.println("Answer: "+ans+"\nE - Exit");
			System.out.println("-----------------");
		}
		else
		{
			arithmeticCalc.main(null);
		}
	}
}


class division
{
	public void div()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter First value: ");
		double a = sc.nextDouble();
		System.out.println("enter Second value: ");
		double b = sc.nextDouble();
		
		double ans = a/b;
		System.out.println("-----------------");
		System.out.println("division is:");
		System.out.format("%.5f\n",ans);
		System.out.println("-----------------");
		
		
	}
}

public class arithmeticCalc {
	public static void main(String[] args)
	{
		System.out.println(" 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n ");
		System.out.println("Please select an Operation");
		Scanner sc = new Scanner(System.in);
		int operation = sc.nextInt();
		
		switch(operation)
		{
		case 1:
			addition objA = new addition();
			objA.add(sc);
		case 2:
			subtraction objS = new subtraction();
			objS.subt(sc);
		case 3:
			multiplication objM = new multiplication();
			objM.multi(sc);
		case 4:
			division objD = new division();
			objD.div();
		
		}
		
	}
	

}