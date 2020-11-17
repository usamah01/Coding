
public class boolOp
{

    boolean finished = false;
    int m= 3;
    int n = 8;
	boolean bresult;

   void a_boolOperation()
   {
	   System.out.println("m = " + m);
	   System.out.println("n = " + n);

	   bresult = ( n > m) && ( m < -2);
	   System.out.println("( n > m) && ( m < -2); =" + bresult);

	   bresult = (m > 5) || ! (finished);
	   System.out.println("(m > 5) || ! (finished)" + bresult);

	   bresult = !(n < 5) && !(finished);
	   System.out.println("!(n < 5) && !(finished)" + bresult);
   }
    
	
}

