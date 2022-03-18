package course1.lesson6;

public class AnimalsApp {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.swim(200);
		cat.run(201);
		System.out.println("===============");
		dog.run(501);
		dog.swim(11);
	}
}
