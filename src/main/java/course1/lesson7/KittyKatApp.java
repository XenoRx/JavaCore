package course1.lesson7;

/*
1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
*/

import java.util.Arrays;

public class KittyKatApp {
	
	public static void main(String[] args) {
		
		Cat[] cats = new Cat[3];
		cats[0] = new Cat("Barsik", 5);
		cats[1] = new Cat("Murk", 7);
		cats[2] = new Cat("Vasya", 90);
		Plate plate = new Plate(100);
		
		plate.info();
		for (Cat cat : cats) {
			cat.eat(plate);
		}
		/*
		cats[0].eat(plate); круче чем циклы:D
		cats[1].eat(plate);
		cats[2].eat(plate);
		*/
		
		for (Cat cat : cats) {
			System.out.println(cat.isBellyFull(plate));
		}
		
		plate.info();
		
	}
}