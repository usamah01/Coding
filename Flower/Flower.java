
public class Flower
{
  private int petalCount;
  private String name ;
    
   
   Flower(int petalCountIn) 
   {
    petalCount = petalCountIn;
   }
   
   
    Flower(String nameIn) 
    {
      name = nameIn;
    }
  
 
    Flower(String nameIn, int petalCountIn) 
    {
      name = nameIn;
      petalCount = petalCountIn;
     }

    Flower() 
    { 
        petalCount = 0;
        name = "Undefined";
    }
    
    public int getPetalCount()
    {
      return petalCount;
    }
    
    public String getFlowerName()
    {
       return name;
    }

}
