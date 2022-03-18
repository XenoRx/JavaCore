package course1.lesson6;

//Всегда a + b = total
public class Example {
	int a;
	int b;
	int total;
	
	public Example(int a, int b) {
		this.a = a;
		this.b = b;
		this.total = a + b;
	}
	
	public void info() {
		System.out.println(a + " A :" + b + " B :" + total);
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setA(int a) {
		this.a = a;
		this.total = this.a + this.b;
	}
	
	public void setB(int b) {
		this.b = b;
		this.total = this.a + this.b;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
}


