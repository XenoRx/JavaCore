package Resolve1;

import java.net.http.WebSocket;
import java.util.Locale;

public class Person {
	private final String name;
	private final int age;
	private String position;
	private double salary;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", position='" + position + '\'' +
				", salary=" + salary +
				'}';
	}
	
	public void info() {
		System.out.println(this);
	}
	
	private Person(Builder builder) {
		this.name = builder.name;
		this.position = builder.position;
		this.age = builder.age;
		this.salary = builder.salary;
	}
	
	public static class Builder {
		private String name;
		private int age;
		private String position;
		private double salary;
		
		public Builder withName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder withAge(int age) {
			this.age = age;
			return this;
		}
		
		public Builder withSalary(int salary) {
			this.salary = salary;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}
}
