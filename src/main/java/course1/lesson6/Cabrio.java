package course1.lesson6;

public class Cabrio extends Car {
	boolean hasHardTop;
	
	public Cabrio(String model, int year, boolean hasRoof) {
		super(model,year);
		System.out.println("This is the Cabrio constructor");
		this.hasHardTop = hasRoof;
	}
	
	public boolean isHasHardTop() {
		return hasHardTop;
	}
	
	public void setHasHardTop(boolean hasHardTop) {
		this.hasHardTop = hasHardTop;
	}
	
	@Override
	void printName() {
		super.printName();
	}
}
