
public class Person
{
	double cmHeight = 166;
	double kgWeight = 85;
	boolean smoker = true;
	int weeklyAlcholUnits = 10;
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse = 120;
	char gender = 'M';
	
	
	public void checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   System.out.print("Healthy pulse = ");
	   System.out.println(healthyPulse);
	}
	
	public void checkForAbuse()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcholUnits > RWAL) || (smoker) );
	      System.out.print("Checking for abuse -- ");
	      System.out.println(abuser);
	
	}
	
	public void checkForDesirability() {
		boolean desirability;
		desirability = ((cmHeight < 150 && kgWeight > 100));
		System.out.println("Checking Desirability --------");
		System.out.println(desirability);
		
	}
	
	
	public void displayDetails()
	{
	   System.out.println(cmHeight);
	   System.out.println(kgWeight);
	   System.out.println(smoker);
	   System.out.println(weeklyAlcholUnits);
	   System.out.println(RWAL);
	   System.out.println(restPulse);
	   System.out.println(gender);
	}
	
}
