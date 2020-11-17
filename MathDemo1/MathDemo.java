
import java.util.*;
public class MathDemo
{
	
	public double squareRoot(double rootIn)
	{
	 return  Math.sqrt(rootIn);
	}
	
	public void  rollDice()
	{
	   int score;
	   score = (int) (Math.random() * 6) + 1;
	   System.out.println("You rolled a " + score);
	}
	
	public void findThePower()
	{
	   double base, exponent;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a number you wish to raise to the power");
	   base = sc.nextDouble();
	   System.out.println("Enter the power you wish to raise the number to");
	   exponent = sc.nextDouble();
	   System.out.print("The number " + base + " raised to the power " + exponent + " = ");
	   System.out.println(Math.pow(base,exponent));
	}

	
	public void generateLottoNumber() {
	
	int minNumber = 10;
	int maxNumber = 20;	
	System.out.println("A random number will be generated for the lottery");
	int generateNumber = (int)(Math.random() * (minNumber + maxNumber + 1) + minNumber);
	System.out.println(generateNumber);
		
}

	public void acceptIntegers() {
		double rootIn;
		
		
		
		
		
	}
	
	
	
}
//	
//	public void bestOfThree() {
//		
//	}
//	
//	
//}
