

import java.util.*;

public class HiLo {
    
     int random;
    
    public void generateNumber() 
    {
     
        random = (int)(Math.random()*10)+1;
    }
    
   //Write the guess() method below 
   public void guess()
   {
	
	      Scanner sc=new Scanner(System.in);
	    
	      System.out.println("Enter you guess ");
	      int guess = sc.nextInt();
	      
	      //write your code below
	      if (guess >=1 && guess <=5) {
	    	  System.out.println("Your guess is low");
	    	  
	      }
	   
	      else if (guess >5 && guess <=10) {
	    	  
	    	  System.out.println("Your guess is high");
	    	  
	      }
	      
	      else 
	    	  System.out.println("Guess is a hit");
	      
   }
   
    
}
 