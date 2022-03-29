package course2.lesson2.homework2;

public class MyArrayDataException extends Exception{
	public int a;
	public int b;
	
	public MyArrayDataException(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
