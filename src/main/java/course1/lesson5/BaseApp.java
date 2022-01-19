package course1.lesson5;

import java.util.Arrays;

/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */
public class BaseApp {
	
	
	public static void main(String[] args) {
		
		//Employee[] workers = {employee, employee2, employee3, employee4, employee5}; ver №1
		Employee[] actorsArray = new Employee[5];
		actorsArray[0] = new Employee("Nicolas Cage", "Actor", "CageRocks@mail.ru", 89655555555L, 25000, 58);
		actorsArray[1] = new Employee("Robert Downey Jr", "Actor", "Robert@mail.ru", 88003555535L, 40000, 56);
		actorsArray[2] = new Employee("Scarlett Johansson", "Actress", "cute@mail.ru", 91238712322L, 50500, 37);
		actorsArray[3] = new Employee("Johnny Depp", "Actor", "CaptainJackSparrow@mail.ru", 123456789102L, 50000, 58);
		actorsArray[4] = new Employee("Al Pacino", "Actor", "Mafia@mail.ru", 89227667788L, 70000, 81);
		//Вывод инфы в консоль
		for (Employee employee : actorsArray) {
			if (employee.getAge()>40){
				employee.info();
			}
		}
	}
}
