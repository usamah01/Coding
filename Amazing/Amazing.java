
public class Amazing
{

    float x = (float) 2.5;
    float y = (float) -1.5;
    int m = 18;
    int n = 4;
    

 
   void doCalculations()
   {
	   
	   
	   x= x + n * y - (x + n) * y;
	   n= m / n + m % n;
	   y= 5 * x - n / 5;
	   System.out.println(x);
	   System.out.println(y);
	   System.out.println(m);
	   System.out.println(n);
       
   }
}
