package game;

import java.util.Random;

public class Util {
	private static final Random random = new Random();
	// Written by my roommate, works like a better rand().
	public static int randomIntInclusive(int from, int to) {
		if (to == from) return to;
		if (to < from) throw new IllegalStateException("Argument to cannot be less than argument from");
		return from + random.nextInt(to - from + 1);
	}
}
