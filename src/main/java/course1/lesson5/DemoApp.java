package course1.lesson5;

public class DemoApp {
	
	public static void main(String[] args) {
		Car car = new Car("Dodge", 2020, false);
		
		car.info();
		car.printModel();
		car.crash();
		car.info();
		String carModel = car.getModel();
//		Car.info(); Нельзя т.к не статический метод

//		Car car2 = new Car();
//		car2.model = "Ford";
//		car2.year = 1990;
//		car2.wheelsNumber = 6;
//		System.out.println("Model = " + car2.model + " || year = " + car2.year + " || was crashed = " + car2.wasCrashed+"|| wheels number = "+car.wheelsNumber);
//
//		int wheelsNumber = Car.wheelsNumber;
//		String mode = car.model;

//		Car[] cars = new Car[]{car, car2};
		
		//Stringpool
		String str = new String("newString");// в данном случае String это объект
		
		Robot[] robots = new Robot[10];
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot("Robot " + i + " ", i + 10);
		}
		for (Robot robot : robots) {
			robot.info();
		}
	}
	
}
