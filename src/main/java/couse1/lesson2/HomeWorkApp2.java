package couse1.lesson2;

public class HomeWorkApp2 {
	public static void main(String[] args) {
	trueOrFalse(10, 8);
	checkNum(-10);
	trueOrFalse2(0);
	countStringNum("string", 8);
	leapYear(2021);
	}
	
	private static boolean trueOrFalse(int num1, int num2){
		int sum = num1 + num2;
		if (sum >= 10 && sum <= 20){
			System.out.println(true);
			return true;
		} else {
			System.out.println(false);
			return false;
		}
	}
	private static int checkNum(int num1) {
		if (num1 >= 0){
			System.out.println("Число положительное");
		} else {
			System.out.println("Число отрицательное");
		}
		return 0;
	}
	private static boolean trueOrFalse2(int num1) {
		if (num1 < 0){
			System.out.println(true);
			return true;
		} else {
			System.out.println(false);
			return false;
		}
	}
	private static int countStringNum(String var1, int var2) {
		for (int i = 0; i < var2; i++) {
			System.out.println(var1 + " : " + i);
		}
		return 0;
	}
	private static boolean leapYear(int year) {
		if (year % 4 == 0 ){
			System.out.println(true);
			return true;
		} else if (year % 100 == 0){
			System.out.println(true);
			return true;
		} else if (year % 400 == 0){
			System.out.println(true);
			return true;
		} else {
			System.out.println(false);
			return false;
		}
	}
}
