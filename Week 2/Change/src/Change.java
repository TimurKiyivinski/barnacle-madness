import java.util.Scanner;

public class Change {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		Coins userCoins = new Coins();
		int[] coinChange;
		
		System.out.println("Enter amount to calculate");
		Double userDbl = scanner.nextDouble();
		
		coinChange = userCoins.getChange(userDbl);
		if (coinChange[0] != 0)
			System.out.println(coinChange[0] + " times $2 coins.");
		if (coinChange[1] != 0)
			System.out.println(coinChange[1] + " times $1 coins.");
		if (coinChange[2] != 0)
			System.out.println(coinChange[2] + " times $0.50 coins.");
		if (coinChange[0] != 0)
			System.out.println(coinChange[3] + " times $0.20 coins.");
		if (coinChange[4] != 0)
			System.out.println(coinChange[4] + " times $0.10 coins.");
		if (coinChange[5] != 0)
			System.out.println(coinChange[5] + " times $0.05 coins.");
		if (coinChange[6] != 0)
			System.out.println("With " + coinChange[6] + "c left over.");
	}
}
