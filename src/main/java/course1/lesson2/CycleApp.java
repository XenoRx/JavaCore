package course1.lesson2;

public class CycleApp {
	public static void main(String[] args) {
		
		// 10 % 3 = 1     3+3+3 = 9   остаток 1
		for (int i = 0; i < 10; i++){
			
			if (i % 2 == 0){
				continue;
			}
			if (i > 6){
				break;
			}
			PrintUtil.printFormatted("string " + i);
		}
//		System.out.println(getDividedByThree());
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 5; j++){
				System.out.println("i="+i+"j="+j);
			}
		}
	}
	
/*	public static int getDividedByThree(){
		for (i = 2; i < 10; i = i + 2) {
			if (i % 3 == 0){
				return i;
			}
		}
		return 0;
	} */
}
