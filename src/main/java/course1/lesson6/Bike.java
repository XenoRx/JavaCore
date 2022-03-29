package course1.lesson6;

public class Bike extends Transport{
	int wheelsNumber;
	
	public Bike(int wheelsNumber) {
		this.wheelsNumber = wheelsNumber;
	}
	
	public int getWheelsNumber() {
		return wheelsNumber;
	}
	
	public void setWheelsNumber(int wheelsNumber) {
		this.wheelsNumber = wheelsNumber;
	}
	
	@Override
	public void wroomWroom() {
		System.out.println("Brrrrrr");
	}
	
	@Override
	public void printInventionDate() {
	
	}
}
