package couse1.lesson3;

import java.util.Arrays;

public class TwoDimArrayApp {
	public static void main(String[] args) {
		int[][]	array = new int[5][5];
		System.out.println(Arrays.toString(array));
		
		int[][] newArray = new int[5][];
		
		newArray[0] = new int[]{1,2,3};
		newArray[1] = new int[]{1,2,3,4};
		
		System.out.println(Arrays.toString(newArray));
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(Arrays.toString(newArray));
		}
		
		char[] chars = "Java".toCharArray();
		System.out.println(chars[2]);
		System.out.println("Java".charAt(3));
	}
}
