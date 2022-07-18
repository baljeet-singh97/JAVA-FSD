package arithmaticCalculator;
import java.util.*;

class userInputs
{
	Scanner sc = new Scanner(System.in);
	
	public double inB()
	{
		System.out.println("enter Second Numbeer: ");
		double b = sc.nextDouble();
		return b;
	}
	public double inA()
	{
		System.out.println("enter First Number: ");
		double a = sc.nextDouble();
		return a;
	}
}

class addition
{
	public void add()
	{
		userInputs objUi = new userInputs();
		double a = objUi.inA();
		double b = objUi.inB();
		double ans = a+b;
		System.out.println("-----------------");
		System.out.println("Answer: "+ans);	
		System.out.println("-----------------");
		
	}
}

class subtraction
{
	public void subt()
	{
		userInputs objUi = new userInputs();
		double a = objUi.inA();
		double b = objUi.inB();
		double ans = a-b;
		System.out.println("-----------------");
		System.out.println("Answer: "+ans);	
		System.out.println("-----------------");
			
	}
}

class multiplication
{
	public void multi()
	{
		userInputs objUi = new userInputs();
		double a = objUi.inA();
		double b = objUi.inB();
		double ans = a*b;
		System.out.println("-----------------");
		System.out.print("Answer: ");
		System.out.format("%.3f\n",ans);
		System.out.println("-----------------");
	}
}

class division
{
	public void div()
	{
		userInputs objUi = new userInputs();
		double a = objUi.inA();
		double b = objUi.inB();
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
			//created object of class addition
			addition objA = new addition();
			
			//passing scanner object to the method and calling the class
			objA.add();
			break;
		case 2:
			//created object of class subtraction
			subtraction objS = new subtraction();
			
			//passing scanner object to the method and calling the class
			objS.subt();
			break;
		case 3:
			multiplication objM = new multiplication();
			objM.multi();
			break;
		case 4:
			division objD = new division();
			objD.div();
		
		}
		
	}
	

}