package couse1.lesson2;

public class HomeWorkApp2 {
	public static void main(String[] args) {
		System.out.println(trueOrFalse(10, 8));
		checkNum(-10);
		System.out.println(trueOrFalse2(0));
		countStringNum("string", 8);
		System.out.println(leapYear(2028));
	}
	
	private static boolean trueOrFalse(int num1, int num2){
		int sum = num1 + num2;
		if (sum >= 10 && sum <= 20){
			return true;
		} else {
			return false;
		}
	}
	private static void checkNum(int num1) {
		if (num1 >= 0){
			System.out.println("Число положительное");
		} else {
			System.out.println("Число отрицательное");
		}
	}
	private static boolean trueOrFalse2(int num1) {
		if (num1 < 0){
			return true;
		} else {
			return false;
		}
	}
	private static void countStringNum(String var1, int var2) {
		for (int i = 0; i < var2; i++) {
			System.out.println(var1 + " : " + i);
		}
	}
	private static boolean leapYear(int year) {
		if (year % 4 == 0 ){
			return true;
		} else if (year % 100 == 0){
			return true;
		} else if (year % 400 == 0){
			return true;
		} else {
			return false;
		}
	}
}
