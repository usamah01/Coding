
import java.util.*;

public class Product
{
	final double VAT_RATE = 17.5;      
    //Declare price and assign an initial value
    double costPrice ;
   
     
    public void setCostPrice()
    {
      costPrice = 400;
      System.out.print("Cost price set to ");
      System.out.println(costPrice);
    }
     
    public void displayPriceDetails()
    { 
    //output to screen
     System.out.println("***** Product Price Check *******");
     System.out.print("Cost Price = ");
     System.out.println(costPrice);
     System.out.print("VAT rate =");
     System.out.println(VAT_RATE);
     
     System.out.print("Selling Price ");
     System.out.println( getSellPrice() );
     
     System.out.print("VAT due ");
     System.out.println( getVAT() );
     
     System.out.print("Selling Price including tax = ");
     System.out.println(getSellPrice() + getVAT()  );
    }
    
    public double getCostPrice()
    {
     
      return costPrice;
    }
        
    public double getSellPrice()
    {
        
        double tempSellPrice;
        
        
        tempSellPrice = (costPrice + (costPrice * 30/100)) ;
        
        
        return tempSellPrice;
    }
       
    public double getVAT()
    {
     
      double tempSellPrice;
     
      tempSellPrice = getSellPrice();
      
      
      return tempSellPrice*(VAT_RATE/100);
    }
    
   public void initialiseCostPrice()
   {
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter costPrice ");
        costPrice = sc.nextDouble();
        System.out.println("Cost Price set to " + costPrice);

   }
   
}

    

