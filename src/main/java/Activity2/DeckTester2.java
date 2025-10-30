package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"king", "queen", "jack", "ten", "nine", "eight", "seven", "six", "five", "four", "three", "two", "ace"};
		String[] suits = {"hearts", "spades", "diamonds", "clubs"};
		int[] points = {13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		Deck2 a = new Deck2(ranks, suits, points);
		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.deal());
		}
	}
}
