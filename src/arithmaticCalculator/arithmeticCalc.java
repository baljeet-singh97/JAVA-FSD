package arithmaticCalculator;
import java.util.*;

//Declared a input class to store all the inputs at once
class userInputs
{
	Scanner sc = new Scanner(System.in);
	
	//used public access specifier 
	//taking inputs from user
	public double inB()
	{
		System.out.print("enter Second Numbeer: ");
		double b = sc.nextDouble();
		return b;
	}
	public double inA()
	{
		System.out.print("enter First Number: ");
		double a = sc.nextDouble();
		return a;
	}
}

//Declared addition class to perform Addition
class addition
{
	public void add()
	{
		//calling userInput class for getting inputs from user
		userInputs objUi = new userInputs();
		double a = objUi.inA();
		double b = objUi.inB();
		double ans = a+b;
		
		//output to the user
		System.out.println("-----------------");
		System.out.println("Answer: "+ans);	
		System.out.println("-----------------");
		
	}
}

//Declared subtraction class to perform Subtraction
class subtraction
{
	public void subtract()
	{
		//calling userInput method for getting inputs from user
		userInputs objUi = new userInputs();
		double a = objUi.inA();
		double b = objUi.inB();
		double ans = a-b;
		
		//output to the user
		System.out.println("-----------------");
		System.out.println("Answer: "+ans);	
		System.out.println("-----------------");
			
	}
}

//Declared multiplication class to perform multiply
class multiplication
{
	public void multiply()
	{
		//calling userInput method for getting inputs from user
		userInputs objUi = new userInputs();
		double a = objUi.inA();
		double b = objUi.inB();
		double ans = a*b;
		
		//output to the user
		System.out.println("-----------------");
		System.out.print("Answer: ");
		
		//used format to fix length after decimal value
		System.out.format("%.3f\n",ans);
		System.out.println("-----------------");
	}
}

//Declared division class to perform divide
class division
{
	public void divide()
	{
		//calling userInput method for getting inputs from user
		userInputs objUi = new userInputs();
		double a = objUi.inA();
		double b = objUi.inB();
		double ans = a/b;
		
		//output to the user
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
		System.out.print("Please select an Operation: ");
		
		// creates an object of Scanner class
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		//taking input from the user
		int operation = sc.nextInt();
		
		//used switch case to navigate to desired Class
		switch(operation)
		{
		case 1:
			//created object of class addition
			addition objA = new addition();
			
			//calling the class
			objA.add();
			break;
		case 2:
			//created object of class subtraction
			subtraction objS = new subtraction();
			
			//calling the class
			objS.subtract();
			break;
		case 3:
			multiplication objM = new multiplication();
			objM.multiply();
			break;
		case 4:
			division objD = new division();
			objD.divide();
		default:
			System.out.println("Wrong input ");
		}
		System.out.print("\n");
		arithmeticCalc.main(null);
	}
	
}