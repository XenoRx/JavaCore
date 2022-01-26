package course1.lesson6;

public class Cat extends Animal {
	@Override
	protected void swim(int s) {
		System.out.println("Коты не плавают");
	}
	
	@Override
	protected void run(int r) {
		if (r>200){
			System.out.println("Кот не может пробежать больше 200 метров");
		}
	}
}
