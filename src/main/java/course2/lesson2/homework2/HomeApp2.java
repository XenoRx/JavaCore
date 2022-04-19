package course2.lesson2.homework2;

public class HomeApp2 {
	public static void main(String[] args) {
		String[][] twoDimArray = new String[][]
				{
						{"a", "b", "c", "d"},
						{"z", "x", "æ", "Ý"},
						{"s", "f", "g", "w"},
						{"1", "2", "3", "4", "5"},
						{"fufk","asdasdddadsd","pewepw","123123"}
				};
		try {
			try {
				int result = method(twoDimArray);
				System.out.println(result);
			} catch (MyArraySizeException e) {
				System.out.println("Размер массива превышен");
			}
		} catch (MyArrayDataException e) {
			System.out.println("Неправильное значение массива");
			System.out.println("Ошибка в ячейке: " + e.a + "x" + e.b);
		}
		
		
	}
	
	public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
		int count = 0;
		if (arr.length != 4) {
			throw new MyArraySizeException();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length != 4) {
				throw new MyArraySizeException();
			}
			for (int j = 0; j < arr[i].length; j++) {
				try {
					count = count + Integer.parseInt(arr[i][j]);
				}
				catch (NumberFormatException e) {
					throw new MyArrayDataException(i, j);
				}
			}
		}
		return count;
	}
}