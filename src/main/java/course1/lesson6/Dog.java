package course1.lesson6;

public class Dog extends Animal {
	@Override
	protected void run(int r) {
		if (r<=500) {
			System.out.println("Собака пробежала: " + r);
		}
		if (r>500){
			System.out.println("Собака не может пробежать больше 500 метров");
		}
	}
	@Override
	protected void swim(int s) {
		if (s<=10) {
			System.out.println("Собака проплыла: " + s);
		}
		if(s>10){
			System.out.println("Собака не может проплыть больше 10 метров");
		}
	}
}
