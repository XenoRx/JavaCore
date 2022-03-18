package course1.lesson2;

public class MethodApp {
	public static void main(String[] args) {
	
		int v1 = multiplication(4,10);
		int v2 = multiplication(5,6.0);
		int v3 = multiplication(v1,v2);
		
		System.out.println("v1 = " + v1 + "v2 = " + v2 + "v3 = " + multiplication(v1,v2));
		PrintUtil.printFormatted("v1 = " + v1 + "v2 = " + v2 + "v3 = " + multiplication(v1,v2));
		PrintUtil.printFormatted("string to format");
	}
	
	public static int multiplication(int n1, int n2){
		int result = n1 * n2;  //return n1*n2;
		return result;
	}
	public static int multiplication(int n1, double n2){
		int result = n1 * (int)n2;  //return (int) (n1*n2);
		return result;
	}
	
	//Модификатор доступа + Тип значения + Имя + Набор параметров
	
	//naming - ClassName MyClassName
	//methods, variables - lowerCaseUpperCase methodName valiableName
	
	//CONSTANTS - UPPER_CASE(snake_case)
	
	//type - void / real type то что вернёт int,boolean etc
	
	//public - protected - (no modifier)=default - private
}
