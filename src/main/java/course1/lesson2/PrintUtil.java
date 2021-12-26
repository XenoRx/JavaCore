package course1.lesson2;

public class PrintUtil {
	/**
	 * Форматирует строку тремя * до и после
	 * @param str строка для форматирования
	 */
	public static void printFormatted(String str){
		System.out.println("***" + str + "***");
	}
	/**
	 * Форматирует строку тремя * до и после
	 * @param str строка для форматирования
	 */
	public static String getFormatted(String str) {
		return "***" + str + "***";
	}
}
