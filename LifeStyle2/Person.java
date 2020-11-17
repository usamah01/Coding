import java.util.Scanner;


public class Person
{
	double cmHeight;
	double kgWeight;
	boolean smoker = true;
	int weeklyAlcholUnits; // 1 pint = 2 units, 1 short = 1 unit)
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse;
	int random;
	
	
	public boolean checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   return healthyPulse;
	}
	
	public boolean checkAbuser()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcholUnits > RWAL) || (smoker) );
	      return abuser;
	}
	
	public void displayProfile()
	{
	   System.out.println("………Health Profile……");
	   
	   System.out.println("Healthy pulse check = " + checkPulse());
	   System.out.print("Abusing Body = " + checkAbuser());
	   
	}
	
	public void curseAndSwear() {
		
		random = (int)(Math.random()*5)+1;
		
		//Create a new scanner object to receive user input
	     Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Enter a number between 1 to 5 ");
	    int random = sc.nextInt();
 
	switch(random)
	{
	case 1:
		random = 1;
		System.out.println("What an awful number");
		break;
	case 2: 
		random = 2;
		System.out.println("This is getting on my nerves");
		break;
	
	case 3:
		random = 3;
		System.out.println("Stop this nonsence");
		break;
	
	case 4:
		random= 4;
		System.out.println("This is annoying");
		break;
	
	case 5:
		random = 5;
		
		System.out.println("Forgod sake");
		break;
	
	default:
		random= 0;
		System.out.println("What an awful number");
		break;
	
	}
	
	
		
	}
	    
	    
	    
	    
	    
	    
	 
		
	}
	
	

