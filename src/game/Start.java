package game;

import library.TextIO;

public class Start {
	public static void main(String[] args) {
		System.out.println("Welcome to this text based game made by me, Meelis Hass from C11");
		System.out.println("Can I have your name?");
		String name = TextIO.getlnString();
		System.out.println("Now"+ name +", You will begin your adventure at ");

		Beginning beginning = new Beginning();
		beginning.printVal();

	}
}
