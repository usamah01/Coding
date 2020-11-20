using System;

namespace Variables
{

class Program
{
    static void Main(string[] args)
    {
    var number = 3;
    int count = 10;
    float totalCost = 21.90f;
    char Initial ='A';
    String name= "Usamah";
    bool isInTheQueue = true;
    Console.WriteLine(number);
 
    System.Console.WriteLine("Hello" + name," The cost of your product is" + totalCost, "The number of pieces in your product is " + number, "The initial in your last name is" + Initial, "Are you standing in the queue?" + isInTheQueue);
    }
}

}