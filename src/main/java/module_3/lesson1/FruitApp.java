package module_3.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FruitApp {
	public static void main(String[] args) {
		//================================= Задание 1*
		String[] array = new String[2];
		array[0] = "A";
		array[1] = "B";
		reverseArray(array);
		//================================= Задание 2*
		Integer[] array2 = {2, 1}; //2
		arrayToArrayList(array2);
		//================================= Задание 3
		Box<Apple> appleBox1 = new Box<>();
		Box<Apple> appleBox2 = new Box<>();
		Box<Orange> orangeBox1 = new Box<>();
		Box<Orange> orangeBox2 = new Box<>();
//		fruitBox.addFruitToBox(new Apple(1.0f));
		
		appleBox1.addFruitToBox(new Apple());
		appleBox1.addFruitToBox(new Apple());
		appleBox1.addFruitToBox(new Apple());
		
		orangeBox2.addFruitToBox(new Orange());
		orangeBox2.addFruitToBox(new Orange());
		System.out.println(appleBox1.compare(orangeBox1));
		appleBox1.transferFruits(appleBox2);
	}
	
	public static void reverseArray(String[] array) { //1*
		List<String> list = java.util.Arrays.asList(array);
		Collections.reverse(list);
		System.out.println(list);
	}
	
	public static void arrayToArrayList(Integer[] array) {//2*
		List<Integer> temp = Arrays.asList(array);
		System.out.println(temp);
	}
}
