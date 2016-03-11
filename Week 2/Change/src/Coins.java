
public class Coins {
	public int[] getChange(Double cash) {
		int[] change = new int[7];
		
		cash *= 100;
		Double result;

		result = cash / 200;
		cash %= 200;
		change[0] = result.intValue();

		result = cash / 100;
		cash %= 100;
		change[1] = result.intValue();

		result = cash / 50;
		cash %= 50;
		change[2] = result.intValue();

		result = cash / 20;
		cash %= 20;
		change[3] = result.intValue();

		result = cash / 10;
		cash %= 10;
		change[4] = result.intValue();

		result = cash / 5;
		cash %= 5;
		change[5] = result.intValue();

		change[6] = cash.intValue();		

		return change;
	}
}
