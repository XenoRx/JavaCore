package course2.lesson1;

public class Outer {
	private int i;
	private static int a;
	
	private void m1() {
		i = 10;
		a = 11;
	}
	
	private static void staticM() {
		a = 1;
	}
	
	class Inner {
		private int b;
		
		private void v() {
		
		}
	}
	
	public static void main(String[] args) {
	
	
	}
}