package course1.lesson2;

/**
 * Создать поле 6на6 и заполнить его *
 */

public class DemoApp {
	
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (j > 2){
					System.out.print("0 ");
				}else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
