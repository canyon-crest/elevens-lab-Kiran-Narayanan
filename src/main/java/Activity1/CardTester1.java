package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card1 a = new Card1("king", "hearts", 10);
		Card1 b = new Card1("nine", "spades", 9);
		Card1 c = new Card1("ace", "clubs", 1);
		
		System.out.println(a.suit());
		System.out.println(b.rank());
		System.out.println(c.pointValue());
		System.out.println(a.matches(c));
		System.out.println(b.toString());
	}
}
