package game;

import library.TextIO;
import game.Beginning;
public class Start {
	public static void main(String[] args) {
		System.out.println("Welcome to this text based game made by me, Meelis Hass from C11");
		System.out.println("Can I have your name?");
		String name = TextIO.getlnString();

		if (Beginning.seed == 0) {
			System.out.println("Now "+ name +", You will begin your adventure at test ");

			if (Beginning.seed == 1) {
				System.out.println("Now " + name + ", You will begin your adventure at test1 ");
				if (Beginning.seed == 2) {
					System.out.println("Now " + name + ", You will begin your adventure at test2 ");
					if (Beginning.seed == 3) {
						System.out.println("Now " + name + ", You will begin your adventure at test3 ");
						if (Beginning.seed == 4) {
							System.out.println("Now " + name + ", You will begin your adventure at test4 ");
							if (Beginning.seed == 5) {
								System.out.println("Now " + name + ", You will begin your adventure at test5 ");
								if (Beginning.seed == 5) {
									System.out.println("Now " + name + ", You will begin your adventure at test6 ");


								}
							}
						}
					}
				}
			}
		} else {
			System.out.println("You broke the game gj");
		}



		Beginning beginning = new Beginning();
		beginning.printVal();

	}
}
