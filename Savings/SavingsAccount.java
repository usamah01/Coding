
import java.util.*;
public class SavingsAccount
{  
  
   double balance ;
   int ID ;
   Scanner sc=new Scanner (System.in);
   
   
  
   
   
   public void initialiseAccountDetails()
   {  
 
      System.out.println("********  Creating A New Savings Account *******");
      System.out.println("Enter account ID (integer)");
      ID = sc.nextInt();
      System.out.println("Please enter an initial balance ");
      balance = sc.nextFloat();
      System.out.println("Account Created");
      System.out.println("ID = " + ID);
      System.out.println("Balance = "+ balance);
   }
   
   public void deposit() 
   { 
   
     float amount;
     System.out.println("Please enter amount you wish to deposit ");
     amount = sc.nextFloat();
     balance = balance + amount;
     System.out.println("Transaction completed");
   }

   public void withdraw() 
   {  
  
     float amount;
     System.out.println("Please enter amount you wish to withdraw ");
     amount =  sc.nextFloat();
     balance = balance - amount;    
     System.out.println("Transaction completed");
   }

   public void printStatement()
   {
     System.out.println("Statement for account ID = "+ ID);
     System.out.println("Current balance = " + balance);
   }

   public double getBalance()
   { 
     return balance; 
   }
  
    public int getID()
   { 
 
     return ID; 
   }     

}