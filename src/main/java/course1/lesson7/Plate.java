package course1.lesson7;

public class Plate {
	
	private int food;
	
	public void decreaseFood(int n) {
		food -= n;
	}
	
	public void fillFood() {
		food = 100;
	}
	
	public Plate(int food) {
		this.food = food;
	}
	
	
	public void info() {
		System.out.println("Plate = " + food);
		if (food <= 0) {
			System.out.println("Тарелка пустая");
		}
	}
	
	public int getFood() {
		return food;
	}
	
	public void setFood(int food) {
		this.food = food;
	}
}
