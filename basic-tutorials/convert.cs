using System;

namespace convert
{

class Program
{

static void Main(String[] args)
{


// Compatible Types
byte b = 3;
int i = b;
Console.WriteLine(i);


int trial = 200;
byte btrial = (byte)trial; // Casting
Console.WriteLine(trial);


// Non compatible types
String number ="56789";
byte byte1 = Convert.ToIntByte(number);
Console.WriteLine(i);

} 
}
}