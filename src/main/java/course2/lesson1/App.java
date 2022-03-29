package course2.lesson1;
//Вспоминашки 1го модуля)

import java.time.LocalDate;

class Employee extends Human {
	public Employee(String name, LocalDate birth_date) {
		super(name, birth_date);
	}
	
	private void m() {
		this.name = " . . ";
	}
}

class Bike extends Vehicle {
	@Override
	public void move() {
	}
}

abstract class Vehicle {
	private String model;
	private String type;
	
	public abstract void move();
}

class Human {
	protected String name;
	private LocalDate birth_date;
	
	public Human(String name, LocalDate birth_date) {
		this.name = name;
		this.birth_date = birth_date;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getBirth_date() {
		return birth_date;
	}
	
	public void setBirth_date(LocalDate birth_date) {
		this.birth_date = birth_date;
	}
}

class Student extends Human {
	private String name;
	private int course;
	private String speciality;
	private LocalDate birth_date;
	
	public Student(String name, LocalDate birth_date) {
		super(name, birth_date);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCourse() {
		return course;
	}
	
	public void setCourse(int course) {
		this.course = course;
	}
	
	public String getSpeciality() {
		return speciality;
	}
	
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public LocalDate getBirth_date() {
		return birth_date;
	}
	
	public void setBirth_date(LocalDate birth_date) {
		if (birth_date.isAfter(LocalDate.now())) {
			//... проверка
		}
		this.birth_date = birth_date;
	}
}

public class App {
	//OOP
	//0. Абстракция
	//1. Инкапсуляция
	//2. Наследование
	//3. Полиморфизм
	public static void main(String[] args) {
		//student называется инстанс,объект и экземпляр
		final Student student = new Student("Sergey", LocalDate.now());
		student.setName("David"); // name приватное поле класса
		System.out.println(student.getName());
		Vehicle vehicle1 = new Bike();
		Object o = new String("abs");
		Object o1 = new Integer(1);
		if (o instanceof String) {
			final int lenght = ((String) o).length();
		} else if (o instanceof Integer) {
			final int i = (Integer) o * 10;
		}
		
		
	}
	
}
