Using System;

namespace  convertNonCompatible
{
    
class Program
{
try
{
    int number = "5678";
    byte b = Convert.ToByte(number);
    Console.WriteLine(b);
}
catch (System.Exception)
{

    System.out.println("The number could not return to a target type");
}

}

}