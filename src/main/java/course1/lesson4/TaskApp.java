package course1.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskApp {
	public static void main(String[] args) {
		//Задча
		//Дан массив, требуется удалить все не уникальные значения кроме последнего
		//[3, 4, 5, 3, 5, 6] -> [4, 3, 5, 6]
		
		System.out.println(Arrays.toString(getNewArray2(new int[]{3, 4, 5, 3, 5, 6})));
	}
	
	/*public static Integer[] getNewArray(int[] array){
		List<Integer> list = new ArrayList<>();
		for (int i = array.length-1; i >= 0; i--) {
			if (!list.contains(array[i])){
				list.add(array[i]);
			}
		}
		return list.toArray(new Integer[0]);
	}*/
	public static int[] getNewArray2(int[] array) {
		int[] result = new int[0];
		for (int i = array.length - 1; i >= 0; i--) {
			result = addValue(result, array[i]);
		}
		return result;
	}
	
	public static int[] addValue(int[] array, int value) {
		if (arrayContainsValue(array, value)) {
			return array;
		}
		int[] result = new int[array.length + 1];
		result[0] = value;
		for (int i = 1; i < array.length; i++) {
			result[i + 1] = array[i];
		}
		return result;
	}
	
	public static boolean arrayContainsValue(int[] array, int value) {
		for (int arr : array)
			if (arr == value) {
				return true;
			}
		return false;
	}
}
