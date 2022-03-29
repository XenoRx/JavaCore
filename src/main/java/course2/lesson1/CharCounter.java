package course2.lesson1;

import java.util.Scanner;

public class CharCounter {
	private Reader  reader;
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DummyReader dummyReader = new DummyReader();
		DummyReader reader = dummyReader;
		final CharCounter counter = new CharCounter();
		counter.count("aaaaabbbbbZzzZ");
	}
	
	public void count(String text) {  // a,b,c...z, A,B,C...Z
		
		int[] c = new int[127];
		final char[] chars = text.toCharArray();
		for (char ch : chars) {
			c[ch]++;
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] != 0) {
				System.out.println(((char) i) + " встретилось " + c[i]);
			}
		}
	}
}
