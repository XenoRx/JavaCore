package course1.lesson7;

public class Cat {
	
	private String name;
	private int appetite;
	private boolean bellyFull;
	
	public Cat(String name, int appetite) {
		this.name = name;
		this.appetite = appetite;
	}
	
	public boolean isBellyFull(Plate plate) {
		return bellyFull;
	}
	
	public void eat(Plate plate) {
		if (plate.getFood() > appetite) {
			plate.decreaseFood(appetite);
			bellyFull = true;
			System.out.println(name + " съел: " + appetite + " рыбок" + " || Котик сыт");
		} else {
			bellyFull = false;
			System.out.println(name + " хотел съесть " + appetite + " рыбок, но они закончились:(");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAppetite() {
		return appetite;
	}
	
	public void setAppetite(int appetite) {
		this.appetite = appetite;
	}
}
