package game;

public class Beginning {
	private int seed = (int) (Math.random() * 6);
	public Beginning() {}

	public void printVal() {
		System.out.println(seed);
	}
}