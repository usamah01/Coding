import java.util.Scanner;
import java.util.*;

public class Person
{
	double cmHeight;
	double kgWeight;
	boolean smoker = true;
	int weeklyAlcholUnits; // 1 pint = 2 units, 1 short = 1 unit)
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse;

    public void setHeight(double heightIn)
    {
        cmHeight= heightIn;
    }
       
    public void setWeight(double weightIn)
   {
    kgWeight= weightIn;
    }
    
    public void setPulse(int pulseIn)
    {
        restPulse = pulseIn;
    }
    
    
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
	   System.out.print("Abusing Body = " + '\t' + checkAbuser());
	   
	}
	
	
	public void updateDetails() {
		Scanner sc= new Scanner(System.in);
		System.out.println('\n' +"Enter your weight");
		kgWeight = sc.nextDouble();	
		
		System.out.println("Enter your height");
		cmHeight = sc.nextDouble();
		
		System.out.println("Enter your weekly alcohol units");
		weeklyAlcholUnits = sc.nextInt();
		
		System.out.println("Enter your rest pulse");
		restPulse = sc.nextInt();
		
		System.out.println("Here is your new updated record" + '\n' + kgWeight + '\t' + cmHeight  + '\t' + weeklyAlcholUnits + '\t' +restPulse);
	
		
	}
	
	public void calculateBMI() {
		
		double bmi;
		
		bmi = kgWeight / (cmHeight * cmHeight) * 10000;
		
		
		System.out.println("Your BMI is...." + bmi);
		
		
		
	}
	
	
	
}

