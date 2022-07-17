package arithmaticCalculator;
import java.util.*;

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
		Double ans = 1.0;
		System.out.println("Start Multiplying: ");
		while(true)
		{
			if(sc.hasNextDouble())
			{
				Double a = sc.nextDouble();
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




class division
{
	public void div(Scanner sc)
	{
		System.out.println("enter First value: ");
		double a = sc.nextDouble();
		System.out.println("enter Second value: ");
		double b = sc.nextDouble();
		
		double ans = a/b;
		System.out.println("-----------------");
		System.out.print("Answer: ");
		if(a%b == 0)
		{
			//Explicit type casting the output
			int value = (int)ans;
			System.out.println(value);
		}
		else
		{
			System.out.format("%.3f\n",ans);
		}
		System.out.println("-----------------");
		arithmeticCalc.main(null);
		
	}
}

public class arithmeticCalc {
	public static void main(String[] args)
	{
		//Displaying all the operations to user to perform
		System.out.println(" 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n ");
		System.out.println("Please select an Operation");
		
		// creates an object of Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking input from the user
		int operation = sc.nextInt();
		
		//used switch case to navigate to desired Class
		switch(operation)
		{
		case 1:
			//creating object of class addition
			addition objA = new addition();
			
			//passing scanner scanner object to a method
			objA.add(sc);
		case 2:
			//creating object of class subtraction
			subtraction objS = new subtraction();
			objS.subt(sc);
		case 3:
			multiplication objM = new multiplication();
			objM.multi(sc);
		case 4:
			division objD = new division();
			objD.div(sc);
		
		}
		
	}
	

}