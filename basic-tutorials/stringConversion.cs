using System;

namespace stringConversion{

class Program{
static void Main(string[] args)
{


try
{
  string str = "false";
bool b= Convert.ToBoolean(str);
Console.WriteLine(b);  
}
catch (System.Exception)
{
    
Console.WriteLine("The String could not be converted to a boolean");
}




}

}


}