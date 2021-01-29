
/**
* The CoinSorter program is a class with the
* operations that will be conducted on the
* testCoinSorter.java program. 
* @author  Usamah Ahmed
* @date   2020-11-28 
*/

import java.util.*;
import java.util.Arrays;

public class CoinSorter {

	// Properties and variables for the CoinSorter
	private String currency = "£";
	private int minCoinIn = 0;
	private int maxCoinIn = 10000;
	private int[] coinList = { 200, 100, 50, 20, 10 };

	// Constructor which initialises the properties such as currency,
	// minValueExchange, maxValueExchange and coinList[]
	public CoinSorter(String currency, int minValueExchange, int maxValueExchange, int coinList[]) {

	}

	// Set Methods to set the attributes such as CoinSorter, currency, minCoinIn and
	// maxCoinIn
	public CoinSorter() {

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

	// Print contents of the coin list, showing the denominations in circulation
	public String printCoinList() {
		System.out.println("The current coin denominations are in circulation:" + (Arrays.toString(coinList)));
		return (Arrays.toString(coinList));
	}

	// Take two values such as valueToExchange and coinType to return maximum number
	// of that can be input and print remainder
	public String coinCalculator(int valueToExchange, int coinType) {
		for (int coin : coinList) {
			if (coinType == coin) {
				System.out.println("A total of" + " " + valueToExchange + " x " + coinType + "p" + " "
						+ "can be exchanged with a remainder of" + " " + valueToExchange % coin + "p");
			}
		}
		return (Integer.toString(coinType));
	}

	// Take two value such as valueToExchange and coinType so that the return of the
	// maximum nimber of coin whilst excluding coin type and print remainder
	public String multiCoinCalculator(int valueToExchange, int coinType) {
		System.out.println("The coins exchanged are");
		for (int coin : coinList) {
			if (coinType == coin) {
				System.out.println(0 + "x" + coin + "p,");
			} else {
				System.out.println(valueToExchange / coin + " x " + coin + "p, ");
				valueToExchange = valueToExchange % coin;
			}
			System.out.println("with a remainder of" + " " + valueToExchange + "p");
		}
		return (Integer.toString(valueToExchange));
	}

	// print out the currency, minCoinIn and maxCoinIn
	public String displayProgramConfigs() {
		System.out.println("The Currency is " + currency);
		System.out.println("The Minimum input is " + minCoinIn);
		System.out.println("The Maximum input is " + maxCoinIn);
		return currency;
	}

}