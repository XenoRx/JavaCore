package course1.lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {
	public static void main(String[] args) {
		int[] arr = {1, 0, 1, 0, 1};
		int[] arrCount = new int[100];
		int[] arrMulti = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		int[][] TwoDimArr = new int[5][5];
		arrayRevers(arr); //разворачивает массив
		ArrayCount(arrCount); //пробегает по массиву и печатает в консоль от 1 до 100
		arrayMultiplication(arrMulti); //умножает все числа в массиве на 2 если числа меньше 6
		drawCross(TwoDimArr); //рисует в массиве крест из единиц :)
		arrReturn(5,2);
	}
	
	private static void arrayRevers(int[] arr) {
		System.out.println(Arrays.toString(arr)); //обыный массив
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = 1;
			} else {
				arr[i] = 0;
			}
		}
		System.out.println(Arrays.toString(arr));// развёрнутый массив
	}
	
	private static void ArrayCount(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1 + i;
			System.out.println(arr[i]);
		}
	}
	
	private static void arrayMultiplication(int[] arr) {
		System.out.println("Массив до: " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 6) {
				arr[i] *= 2;
			}
		}
		System.out.println("Массив после: " + Arrays.toString(arr));
	}
	
	private static void drawCross(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j || i == arr.length - 1 - j) {
					arr[i][j] = 1;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
	
	/**
	 * Написать метод, принимающий на вход два аргумента: len и initialValue,
	 * и возвращающий одномерный массив типа int длиной len,
	 * каждая ячейка которого равна initialValue;
	 * @param len длинна массива
	 * @param initialValue значение
	 */
	private static void arrReturn(int len, int initialValue) {
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = initialValue;
		}
		System.out.println(Arrays.toString(arr));
	}
}
