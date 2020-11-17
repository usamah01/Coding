
/**
 * Class to demonstrate Arrays, using JTextArea and 
 * a review of running programs as stand-alone apps
 * 
 * 
 */

import javax.swing.*;

public class BirdTable {
			   
			   //1. Create a reference to an array (of doubles) called temperature
			   double  [ ]  birdtable;
			   //The the array could have been created and populated by the following line
			   //  double [ ] temperature = {9, 11.8, 18, 12.7};
			   
			   public BirdTable()
			   {
			     //2. Allocate memory to store the array  
			       birdtable = new  double[7]; 
			 }
			   
			   public void basicArrayAccess()
			   {   
			     //3. Populate the array
			      birdtable[0] = 19;
			      birdtable[1] = 15;
			      birdtable[2] = 7;
			      birdtable[3] = 11;
			      birdtable[4] = 9;
			      birdtable[5] = 13;
			      birdtable[6] = 5;
			     
			   }
			   
		  public void interactiveArray()
		     {
		       
		       String day;
		       double noBlueTits;
		       //Enter the temperatures using inputDialog and a loop
		       for (int i = 0; i < birdtable.length; i++)
		       {
		         day = JOptionPane.showInputDialog( "Enter number of Blue Tits "+(i+1) );
		         noBlueTits = Double.parseDouble(day );
		         birdtable[i] = noBlueTits;
		        }
		       //output all temperatures
		        System.out.println("No. of Blue Tits entered");
		        for (int i = 0 ; i < birdtable.length ; i++)
		        {
		         System.out.println("No. of Blue Tits per day " + i + " = " + birdtable[i]);
		        }
	
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
	   }
		  
		  
		  
		  
}
	   

	   
	   
	   
	      	