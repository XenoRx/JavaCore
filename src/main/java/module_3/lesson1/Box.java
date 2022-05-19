package module_3.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
	private final List<T> fruits;
	private boolean isEmpty = true;
	
	public Box() {
		this.fruits = new ArrayList<>();
	}
	
	public void addFruitToBox(T fruit) {
		fruits.add(fruit);
		/*for (int i = 0; i < BOX_SIZE; i++) {
		
		}*/
		
	}
	
	public T removeFruitFromBox(T fruit) {
		if (fruits.contains(fruit)) {
			fruits.remove(fruit);
			return fruit;
		}
		return null;
	}
	public void transferFruits(Box box){
		box.fruits.addAll(this.fruits);
	}
	public boolean compare(Box box) {
		return this.getWeight() == box.getWeight();
	}
	
	public float getWeight() {
		if (fruits.size() == 0) return 0;
		float weight = 0;
		for (Fruit fruit : fruits){
			weight += fruit.getWeight();
		}
		return weight;
	}
}
