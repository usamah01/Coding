
/**
* The CoinSorterGUI program is a GUI that allows
* users to conduct mathematical operations from.
* @author  Usamah Ahmed
* @date   2020-11-28 
*/

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.JOptionPane;


public class CoinSorterGUI implements ActionListener {

	// Properties and GUI features specified for the CoinSorterGUI class
	private String currency = "£";
	private int minCoinIn = 0;
	private int maxCoinIn = 10000;
	private int[] coinList = { 200, 100, 50, 20, 10 };

	JLabel label;
	JFrame frame;
	JFrame frame3;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button10;
	JOptionPane option1;
	JOptionPane option2;
	JOptionPane option3;
	JOptionPane option4;
	JOptionPane option5;
	JOptionPane option6;
	JOptionPane option7;
	JOptionPane option8;
	JOptionPane option9;
	JOptionPane option10;

	// Constructor and also display of the main menu. GUI features initialised on
	// frame
	public CoinSorterGUI() {

		label = new JLabel("***Coin Sorter - Main Menu***");
		label.setFont(new Font("Serif", Font.PLAIN, 14));

		button1 = new JButton("Coin calculator");
		button1.setBounds(100, 80, 200, 60);
		button1.addActionListener(this);
		option1 = new JOptionPane("1 - Coin calculator");
		option1.setBounds(100, 100, 200, 200);
		option1.setVisible(false);

		button2 = new JButton("Multiple coin calculator");
		button2.setBounds(300, 80, 200, 60);
		button2.addActionListener(this);
		option2 = new JOptionPane("Multi coin calculator");
		option2.setBounds(100, 100, 200, 200);
		option2.setVisible(false);

		button3 = new JButton("Print coin list");
		button3.setBounds(500, 80, 200, 60);
		button3.addActionListener(this);
		option3 = new JOptionPane("Print coin list");
		option3.setBounds(100, 100, 200, 200);
		option3.setVisible(false);

		button4 = new JButton("Set details");
		button4.setBounds(700, 80, 200, 60);
		button4.addActionListener(this);
		option4 = new JOptionPane("Set details");
		option4.setBounds(100, 100, 200, 200);
		option4.setVisible(false);

		button5 = new JButton("Display program configurations");
		button5.setBounds(900, 80, 200, 60);
		button5.addActionListener(this);
		option5 = new JOptionPane("Display program configurations");
		option5.setBounds(100, 100, 200, 200);
		option5.setVisible(false);

		button6 = new JButton("Quit the Program");
		button6.setBounds(1100, 80, 200, 60);
		button6.addActionListener(this);
		option6 = new JOptionPane("Quit the Program");
		option6.setBounds(100, 100, 200, 200);
		option6.setVisible(false);

		frame = new JFrame("Main Menu");
		frame.setSize(1500, 500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.add(button1);
		frame.add(option1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.setVisible(true);

	}

	// Constructor which initialises the properties such as currency,
	// minValueExchange, maxValueExchange and coinList[]
	public CoinSorterGUI(String currency, int minValueExchange, int maxValueExchange, int coinList[]) {

	}

	public void setCurrency(String currency) {
		this.currency = currency;

	}

	public void setMinCoinIn(int minCoinIn) {
		this.minCoinIn = minCoinIn;
	}

	public void setMaxCoinIn(int maxCoinIn) {
		this.maxCoinIn = maxCoinIn;
	}

	// Get Methods which return the attribute values for currency, minCoinIn and
	// maxCoinIn
	public String getCurrency() {
		return currency;

	}

	public int getMinCoinIn() {
		return minCoinIn;

	}

	public int getMaxCoinIn() {
		return maxCoinIn;

	}

	// ActionPerformed method initialised on ActionEvent argument. Each operation
	// will perform as a result of this class
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button1) { // button1 function is the coin calculator which will perform below operations
										// to display valueToExchange x coinType and return the remainder remaining.
			String response;

			response = JOptionPane.showInputDialog("Please enter a value to exchange which must be between 0 to 10000");
			int valueToExchange = Integer.parseInt(response);
			valueToExchange = Integer.parseInt(response);
			if (valueToExchange <= 10000) {
				JOptionPane.showMessageDialog(null, "Valid");
			} else {
				JOptionPane.showInputDialog("Please input an appropriate value again");
				valueToExchange = Integer.parseInt(response);
			}

			response = JOptionPane.showInputDialog(
					"Please enter a coin type which should be of any of the following amounts: 200, 100, 50, 20, 10");
			int coinType = Integer.parseInt(response);
			if (coinType(200, 100, 50, 20, 10)) {
				JOptionPane.showMessageDialog(null, "Valid");
			} else {
				valueToExchange = Integer.parseInt(response);
			}
			for (int coin : coinList) {
				if (coinType == coin) {

					JOptionPane.showMessageDialog(null, "A total of" + " " + valueToExchange + " x " + coinType + "p"
							+ " " + "can be exchanged with a remainder of" + " " + valueToExchange % coin + "p");

				}
			}
			option1.setVisible(false);
		}

		if (e.getSource() == button2) { // button2 is multiple coin calculator function, takes two string responses from
										// user and returns remainder from value to exchange and each coin type
			String response2;
			response2 = JOptionPane
					.showInputDialog("Please enter a value to exchange which must be between 0 to 10000");
			int valueToExchange = Integer.parseInt(response2);
			valueToExchange = Integer.parseInt(response2);
			if (valueToExchange <= 10000) {
				JOptionPane.showMessageDialog(null, "Valid");
			} else {
				JOptionPane.showInputDialog("Please input an appropriate value again");
				valueToExchange = Integer.parseInt(response2);
			}

			response2 = JOptionPane.showInputDialog(
					"Please enter a coin type which should be of any of the following amounts: 200, 100, 50, 20, 10");
			int coinType = Integer.parseInt(response2);
			JOptionPane.showMessageDialog(null, "The coins exchanged are");
			for (int coin : coinList) {
				if (coinType == coin) {
					JOptionPane.showMessageDialog(null, 0 + "x" + coin + "p,");
				} else {
					JOptionPane.showMessageDialog(null, valueToExchange / coin + " x " + coin + "p, ");
					valueToExchange = valueToExchange % coin;
				}
				JOptionPane.showMessageDialog(null, "with a remainder of" + " " + valueToExchange + "p");
			}
		}
		
		option2.setVisible(true);

		if (e.getSource() == button3) { // button3 function prints coin list and will print the currency coin
										// denomination is circulation

			JOptionPane.showMessageDialog(null,
					"The current coin denominations are in circulation:" + (Arrays.toString(coinList)));

		}
		option3.setVisible(true);

		if (e.getSource() == button5) { // button5 is display program configurations function, printing the system set
										// property variables
			JOptionPane.showMessageDialog(null, "The Currency is " + currency + " , " + "the Minimum input is " +  minCoinIn+ " , "+  "and the Maximum input is "+ maxCoinIn );
	
	
		}
		option5.setVisible(true);

		if (e.getSource() == button6) { // button6 will close the application
			JOptionPane.showMessageDialog(null, "You have quit the program, see you again next time");
			System.exit(6);
		}
		option6.setVisible(true);

		if (e.getSource() == button4) { // button4 allows user to set details for the application
			showNewFrame();
			button4.addActionListener(this);
		}
		if (e.getSource() == button7) { // button7 allows currency to be set
			String response3;
			response3 = JOptionPane.showInputDialog("1- Set currency");
			String currency = (response3);
			JOptionPane.showMessageDialog(null, "Currency has been set as" + " " + currency);
		}
		option7.setVisible(true);

		if (e.getSource() == button8) { // button8 allows user to set the minimum coin input value
			String response4;
			response4 = JOptionPane.showInputDialog("2- Set minimum coin input value");
			int setMinCoinIn = Integer.parseInt(response4);
			if (setMinCoinIn <= 10000) {
				JOptionPane.showMessageDialog(null, "Valid");
			} else {
				JOptionPane.showInputDialog("Please input an appropriate value again");
				setMinCoinIn = Integer.parseInt(response4);
			}

			JOptionPane.showMessageDialog(null, "Minimum coin input has been set as" + " " + setMinCoinIn);
		}
		option8.setVisible(true);

		if (e.getSource() == button9) { // button9 allows user to set the maximum coin input value
			String response5;
			response5 = JOptionPane.showInputDialog("3- Set maximum coin input value");
			int setMaxCoinIn = Integer.parseInt(response5);
			if (setMaxCoinIn <= 10000) {
				JOptionPane.showMessageDialog(null, "Valid");
			} else {
				JOptionPane.showInputDialog("Please input an appropriate value again");
			}

			JOptionPane.showMessageDialog(null, "Maximum coin input has been set as" + " " + setMaxCoinIn);

		}
		option9.setVisible(true); // button10 from set details interface will return user back to main screen

		if (e.getSource() == button10) {
			MainMenu();
			button10.addActionListener(this);

		}
		option10.setVisible(true);

		option4.setVisible(true);
	}

	private boolean coinType(int i, int j, int k, int l, int m) {
		// TODO Auto-generated method stub
		return false;
	}

	public void MainMenu() { // interface for MainMenu screen
		label = new JLabel("***Coin Sorter - Main Menu***");
		label.setFont(new Font("Serif", Font.PLAIN, 14));

		button1 = new JButton("Coin calculator");
		button1.setBounds(100, 80, 200, 60);
		button1.addActionListener(this);
		option1 = new JOptionPane("1 - Coin calculator");
		option1.setBounds(100, 100, 200, 200);
		option1.setVisible(false);

		button2 = new JButton("Multiple coin calculator");
		button2.setBounds(300, 80, 200, 60);
		button2.addActionListener(this);
		option2 = new JOptionPane("Multi coin calculator");
		option2.setBounds(100, 100, 200, 200);
		option2.setVisible(false);

		button3 = new JButton("Print coin list");
		button3.setBounds(500, 80, 200, 60);
		button3.addActionListener(this);
		option3 = new JOptionPane("Print coin list");
		option3.setBounds(100, 100, 200, 200);
		option3.setVisible(false);

		button4 = new JButton("Set details");
		button4.setBounds(700, 80, 200, 60);
		button4.addActionListener(this);
		option4 = new JOptionPane("Set details");
		option4.setBounds(100, 100, 200, 200);
		option4.setVisible(false);

		button5 = new JButton("Display program configurations");
		button5.setBounds(900, 80, 200, 60);
		button5.addActionListener(this);
		option5 = new JOptionPane("Display program configurations");
		option5.setBounds(100, 100, 200, 200);
		option5.setVisible(false);

		button6 = new JButton("Quit the Program");
		button6.setBounds(1100, 80, 200, 60);
		button6.addActionListener(this);
		option6 = new JOptionPane("Quit the Program");
		option6.setBounds(100, 100, 200, 200);
		option6.setVisible(false);

		frame = new JFrame("Main Menu");
		frame.setSize(1500, 500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.add(button1);
		frame.add(option1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.setVisible(true);

	}

	public void showNewFrame() { // second interface which is frame3, initialised when set Details button is
									// clicked on
		button7 = new JButton("Set currency");
		button7.setBounds(50, 100, 200, 60);
		button7.addActionListener(this);
		option7 = new JOptionPane("Set currency");
		option7.setBounds(100, 100, 200, 200);
		option7.setVisible(false);

		button8 = new JButton("Set minimum input value");
		button8.setBounds(300, 100, 200, 60);
		button8.addActionListener(this);
		option8 = new JOptionPane("Set minimum input value");
		option8.setBounds(100, 100, 200, 200);
		option8.setVisible(false);

		button9 = new JButton("Set maximum input value");
		button9.setBounds(550, 100, 200, 60);
		button9.addActionListener(this);
		option9 = new JOptionPane("Set maximum input value");
		option9.setBounds(100, 100, 200, 200);
		option9.setVisible(false);

		button10 = new JButton("Return to main menu");
		button10.setBounds(800, 100, 200, 60);
		button10.addActionListener(this);
		option10 = new JOptionPane("Return to main menu");
		option10.setBounds(250, 100, 200, 200);
		option10.setVisible(false);

		frame3 = new JFrame("Set details");
		frame3.setSize(1500, 500);
		frame3.setLayout(null);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.add(button7);
		frame3.add(button8);
		frame3.add(button9);
		frame3.add(button10);
		frame3.setVisible(true);

	}
}




