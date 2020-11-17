import java.util.*;

public class KlingonShip
{
	double photonPower = 45;
	int threatFactor = 7;
	double cosmicProximity = 20.6;
	
	
public void displayKlingonDetails() {
	System.out.println("The photo power is" +'\n'+ photonPower);
	System.out.println("The threat factor is" +'\n'+ threatFactor);
	System.out.println("The cosmic proximity is" +'\n'+ cosmicProximity);
	
	
}
	
	public double getDangerLevel() {
		double dangerLevel;
		
		dangerLevel =  (photonPower * threatFactor)/cosmicProximity;
		System.out.println("Danger level is" + '\t' + dangerLevel);
		return dangerLevel;
	}
	
		public void promptSettings() {
			
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the photon power. Values must be between 1 to 100" +'\n' );
		photonPower= sc.nextDouble();
		
		System.out.println("Enter the threat factor. Values must be betweern 1 to 10" + '\n');
		threatFactor = sc.nextInt();	
			
		System.out.println("Enter the cosmic proximity. Values must be between 0 to 25" + '\n');	
		cosmicProximity = sc.nextDouble();	
			
		System.out.println("Check to see if the values have been updated");
			
		}
		
		
	}
	
