import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class BirdTableTester{
	
	public static void main(String[] args) {
		
		BirdTable b= new BirdTable();
		b.basicArrayAccess();
		b.interactiveArray();
		
		
		//Build an array.
	      int hArray[] = { 19, 15, 7, 11, 9, 13,};

	     //String to hold output
	      String output = "Day\tNo.BlueTits\tHistogram";

	      // for each array element, output a bar in histogram
	      for ( int counter = 0; counter < hArray.length; counter++ ) {
	         output += 
	            "\n" + counter + "\t" + hArray[ counter ] + "\t";

	         // print bar of asterisks
	         for ( int stars = 0; stars < hArray[ counter ]; stars++ )
	            output += "*";
	      }
	      //Create a new text area object to hold the text
	      JTextArea outputArea = new JTextArea();
	      outputArea.setText( output );

	      JOptionPane.showMessageDialog( null, outputArea,
	         "Histogram Printing Program",JOptionPane.INFORMATION_MESSAGE );

	   }
	
		
	}

