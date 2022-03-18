package course1.lesson5;

import java.util.Arrays;

/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 */
public class Employee {
	private String name;
	private String position;
	private String email;
	private long mobilePhone;
	private int salary;
	private int age;
	
	public Employee(String name, String position, String email, long mobilePhone, int salary, int age) {
		this.name = name;
		this.position = position;
		this.email = email;
		this.mobilePhone = mobilePhone;
		this.salary = salary;
		this.age = age;
	}
	
	public void info() {
		System.out.println("Name= " + getName() + "\n" + "Position= " + getPosition() + "\n" + "Email= " + getEmail() + "\n" + "Phone= " + getMobilePhone() + "\n" + "Salary= " + getSalary() + "\n" + "Age= " + + getAge() + "\n=================");
	}
	
	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public String getEmail() {
		return email;
	}
	
	public long getMobilePhone() {
		return mobilePhone;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setMobilePhone(long mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
