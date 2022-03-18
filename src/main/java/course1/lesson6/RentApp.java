package course1.lesson6;

import java.util.Arrays;

public class RentApp {
	public static void main(String[] args) {
		Car car = new Car("Supra", 1995);
		System.out.println("===============================");
		Car van = new Van("Ford", 2005, 7);
		Car cabrio = new Cabrio("Opel", 2000, true);
		
		System.out.println(car instanceof Van);//false
		System.out.println(car instanceof Car);//true
		System.out.println(van instanceof Car);//true
		System.out.println(cabrio instanceof Transport);//false
		
		Car[] cars = {car, cabrio, van};
		for (Car c : cars) {
			System.out.println(c.getModel());
		}
		
		System.out.println();
		System.out.println("Only vans");
		for (Car c : cars) {
			if (c instanceof Van){
				Van v = (Van) c;
				System.out.println("This is a van: " + v.getSeats());
			}
		}
		
		System.out.println(van);
		
		Transport[] transports = {car, cabrio, van};
		for(Transport transport : transports){
			System.out.println(transport);
		}
		System.out.println(Arrays.toString(transports));
		
	}
}
