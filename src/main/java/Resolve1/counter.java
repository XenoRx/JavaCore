package Resolve1;

import java.util.Scanner;

public class counter {
	public static void main(String[] args) {
//		count1();
//		creditCalc();
//		mass1();
//		mass2();
	}
	
	/**
	 * Функция count1 высчитывает сколько секунд в днях
	 */
	public static void count1() {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		int sum = days * 24 * 60 * 60;
		System.out.println(sum + " секунд в " + days + " днях");
	}
	
	/**
	 * Функция credicCalc высчитывает 10% от суммы займа в месяц
	 */
	public static void creditCalc() {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		int months = 12;
		for (int i = 0; i < months; i++) {
			amount = amount * 90 / 100; //высчитывает сколько % от суммы высчитывается каждый месяц
			System.out.println(amount);
		}
	}
	
	/**
	 * Пробегает по массиву и выводит от 0 до 10
	 */
	public static void mass1() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length + 1; i++) {
			System.out.println("index №" + i + " = " + i);
		}
	}
	
	/**
	 * Суммирует все числа в массиве
	 */
	public static void mass2() {
		int[] arr = {6, 42, 3, 7, 28, 92};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
	
	
}
