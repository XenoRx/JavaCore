package course1.lesson6;

public class Car extends Transport {
	
	protected String model;
	protected int year;
	
	public Car(String model, int year) {
		System.out.println("This is the Car constructor");
		this.model = model;
		this.year = year;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return model + " " + year;
	}
	
	public void info(){
		System.out.println(this);
	}
}