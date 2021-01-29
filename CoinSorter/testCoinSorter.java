
/**
* The testCoinSorter class is a class that where
* users conduct mathematical operations from.
* @author  Usamah Ahmed
* @date   2020-11-28 
*/

import java.util.Arrays;
import java.util.Scanner;

public class testCoinSorter {
	// Main method which CoinSorter.java calls back to
	public static void main(String[] args) {
		// object calling to CoinSorter class
		CoinSorter c = new CoinSorter();

		// Main menu presented in a while loop so main menu loops and returns back to
		// main menu after each menu option is clicked on
		System.out.println("***Coin Sorter - Main Menu***");
		Scanner in = new Scanner(System.in);
		int selection = 0;

		do {
			System.out.println("1 - Coin calculator");
			System.out.println("2 - Multiple coin calculator");
			System.out.println("3 - Print coin list");
			System.out.println("4 - Set details");
			System.out.println("5 - Display program configurations");
			System.out.println("6 - Quit the program");

			System.out.println('\n' + "Please enter your option of selection from the above Main Menu");
			selection = in.nextInt();

			// Switch statement which breaks after each case is clicked on
			switch (selection) {
			case 1: // Coin calculator where user inputs values so that coinCalculator() is operated
				System.out.println("1 - Coin calculator");
				Scanner input4 = new Scanner(System.in);
				System.out.println("Please enter a value to exchange which must be between 0 to 10000");
				CoinSorter d = new CoinSorter();
				int valueToExchange;
				valueToExchange = input4.nextInt();
				if (valueToExchange <= 10000) {
					System.out.println("Valid");
				} else {
					System.out.println("Please input an appropriate value again");
					valueToExchange = input4.nextInt();
				}

				System.out.println(
						"Please enter a coin type which should be of any of the following amounts: 200, 100, 50, 20, 10");
				int coinType;
				coinType = input4.nextInt();
				if (coinType(200, 100, 50, 20, 10)) {
					System.out.println("Valid");
				} else if (coinType(200, 100, 50, 20, 10)) {
					System.out.println("Please input an appropriate value again");
				}
				d.coinCalculator(valueToExchange, coinType);

				break;

			case 2: // Multiple coin calculator calling back to multiCoinCalculator() where user
					// inputs two values
				System.out.println("2 - Multiple coin calculator");
				Scanner input5 = new Scanner(System.in);
				System.out.println("Please enter a value to exchange which must be between 0 to 10000");
				CoinSorter e = new CoinSorter();
				int valueToExchange1;
				valueToExchange1 = input5.nextInt();
				if (valueToExchange1 <= 10000) {
					System.out.println("Valid");
				} else {
					System.out.println("Please input an appropriate value again");
					valueToExchange1 = input5.nextInt();
				}
				
				System.out.println(
						"Please enter a coin type which should be of any of the following amounts: 200, 100, 50, 20, 10");

				int coinType1;
				coinType1 = input5.nextInt();
				if (coinType1(200, 100, 50, 20, 10)) {
					System.out.println("Valid");
				} else if (coinType1(200, 100, 50, 20, 10)) {
					System.out.println("Please input an appropriate value again");
				}
				e.multiCoinCalculator(valueToExchange1, coinType1);
				break;

			case 3:// Print coin list which are in denomination thus calling to printCoinList()
					// method
				System.out.println("3 - Print coin list");
				c.printCoinList();
				break;

			case 4: // Set details where user inputs own values for properties
				System.out.println("4 - Set details");
				if (selection == 4)
					System.out.println("***Set Details Sub-Menu***");
				System.out.println("1- Set currency");
				System.out.println("2- Set minimum coin input value");
				System.out.println("3- Set maximum coin input value");
				System.out.println("4- Return to main menu");
				int option2 = in.nextInt();
				switch (option2) {
				case 1: // Set currency calling to setCurrency() method
					Scanner input = new Scanner(System.in);
					CoinSorter s = new CoinSorter();
					System.out.println("1- Set currency");
					String currency;
					currency = input.nextLine();
					if (currency("[£]||[$]")) {
						System.out.println("Valid");
					} else {
						System.out.println("Please input an appropriate value again");
					}
					s.setCurrency(currency);
					System.out.println("Currency has been set as" + " " + currency);
					break;

				case 2: // Set the minimum coin input value calling to
					System.out.println("2- Set minimum coin input value");
					int setMinCoinIn;
					CoinSorter s1 = new CoinSorter();
					Scanner input1 = new Scanner(System.in);
					setMinCoinIn = input1.nextInt();
					if (setMinCoinIn <= 10000) {
						System.out.println("Valid");
					} else {
						System.out.println("Please input an appropriate value again");
					}
					s1.setMinCoinIn(setMinCoinIn);
					System.out.println("Minimum coin input has been set as" + " " + setMinCoinIn);
					break;
				case 3: // maximum coin input value is inputted by user
					System.out.println("3- Set maximum coin input value");
					int setMaxCoinIn;
					CoinSorter s2 = new CoinSorter();
					Scanner input2 = new Scanner(System.in);
					setMaxCoinIn = input2.nextInt();
					if (setMaxCoinIn <= 10000) {
						System.out.println("Valid");
					} else {
						System.out.println("Please input an appropriate value again");
					}
					s2.setMaxCoinIn(setMaxCoinIn);
					System.out.println("Maximum coin input has been set as" + " " + setMaxCoinIn);
					break;
				case 4: // When 4 pressed, user directed to main menu
					System.out.println("4- Return to main menu");

					System.out.println("You will return back to the main menu");
					break;
				}
			case 5: // displayProgramConfigurations() called to print default program configurations
				System.out.println("5 - Display program configurations");
				CoinSorter cf = new CoinSorter();
				cf.displayProgramConfigs();
				break;
			case 6: // System.exit(6) will stop the program from performing further operations
				System.out.println("6 - Quit the program");
				System.out.println("You have quit the program, see you again next time");
				System.exit(6);
			default: // if user selects a value outside 0 to 6, invalid option is printed
				System.out.println("You have selected an invalid option. Choose again");
				break;
			}
		} while (selection != 6);
	}

	// test variables for coinType
	private static boolean coinType(int i, int j, int k, int l, int m) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean currency(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	// test variables for coinType1
	private static boolean coinType1(int i, int j, int k, int l, int m) {
		// TODO Auto-generated method stub
		return false;
	}

}
