/*
 * SRM522-D2-550
 * SOLVED
 */

public class RowAndManyCoins {

	public String getWinner(String cells) {
		if (cells.charAt(0) == 'A' || cells.charAt(cells.length() - 1) == 'A')
			return "Alice";

		return "Bob";
	}

}
