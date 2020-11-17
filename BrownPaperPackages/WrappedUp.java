import java.util.*;

public class WrappedUp
{
	
	public void guessMyFavouriteThing()
	{
	 
		String favAnimal = new String ("cow");
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Guess my favourite animal, it begins with c and has 3 characters");
		favAnimal = sc.next();
				
		System.out.println("The length of your guess is" + '\n'+  favAnimal.length());		
		
		System.out.println("The first letter of your guess begins with" + '\n'+ favAnimal.charAt(0));
				
				
		
		System.out.println("Please enter your guess to compare with my favourite animal");
		String favAnimal1 = sc.next();
	
			if (favAnimal.equals(favAnimal1))
			{
				System.out.println("The strings are indentical");
			}
			else {
				
				System.out.println("The strings are not the same");
			}

	}

	public static void main(String args[]) {
		
		WrappedUp w = new WrappedUp();
		w.guessMyFavouriteThing();
		
	}
}
