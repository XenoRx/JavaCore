package course1.lesson6;
//its a
public class Van extends Car{
	int seats;
	
	public Van(String model, int year, int seats) {
		super(model,year);
		System.out.println("This is the Van constructor");
		this.seats = seats;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public void setSeats(int seats) {
		this.seats = seats;
	}
	@Override
	void printName(){
		System.out.println("This is a van");
	}
}
