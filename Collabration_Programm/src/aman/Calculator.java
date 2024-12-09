package aman;
import java.util.Scanner;


public class Calculator {



	public static void main(String[] args)
	{


		Double number1, number2, result;

		// create an object of Scanner class
		Scanner sc = new Scanner(System.in);

		// ask users to enter operator
		System.out.println("Choose an operator: +, -, *, or /");
		String operator = sc.next();

		// ask users to enter numbers
		System.out.println("Enter first number");
		number1 = sc.nextDouble();

		System.out.println("Enter second number");
		number2 = sc.nextDouble();

		switch (operator)
		{

		// performs addition between numbers
		case "+":
			result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;

			// performs subtraction between numbers
		case "-":
			result = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + result);
			break;

			// performs multiplication between numbers
		case "*":
			result = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + result);
			break;

			// performs division between numbers
		case "/":
			if(number2>0) {
				result = number1 / number2;
				System.out.println(number1 + " / " + number2 + " = " + result);

			
			}
			else
			{
				System.out.println("number2 is not 0 in dvision");
			}
              break;

		default:
			System.out.println("Invalid operator!");
			break;
		}


	}
}