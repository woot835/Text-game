package game;

import library.TextIO;
import game.Beginning;
public class Start {
	public static void main(String[] args) {
		System.out.println("Welcome to this text based game made by me, Meelis Hass from C11");
		System.out.println("Can I have your name?");
		String name = TextIO.getlnString();

		if (beginning.seed = 0) {
			String algus = "test1";

		} if (beginning.seed = 1) {
			String algus = "test2";

		}if (beginning.seed = 2) {
			String algus = "test3";

		}if (beginning.seed = 3) {
			String algus = "test4";

		}if (beginning.seed = 4) {
			String algus = "test5";

		}if (beginning.seed = 5) {
			String algus = "test6";

		} else {
			System.out.println("You broke the game gj");
		}

		System.out.println("Now"+ name +", You will begin your adventure at " + algus);

		Beginning beginning = new Beginning();
		beginning.printVal();

	}
}
