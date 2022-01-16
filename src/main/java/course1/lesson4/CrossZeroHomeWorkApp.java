package course1.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CrossZeroHomeWorkApp {
	//Поле
	public static char[][] map;
	//Размеры поля
	public static final int SIZE = 3;
	//Точек для победы
	public static final int DOTS_TO_WIN = 3;
	//Описание точек
	public static final char DOT_EMPTY = 'æ';
	public static final char DOT_X = 'X';
	public static final char DOT_O = 'O';
	//Сканер
	public static final Scanner SCANNER = new Scanner(System.in);
	//Рандомайзер
	public static final Random RANDOM = new Random();
	
	public static void main(String[] args) {
		initMap();
		printMap();
		while (true) {
			humanTurn();
			printMap();
			if (checkWin(DOT_X)) {
				System.out.println("Победил человек!");
				break;
			}
			if (isMapFull()){
				break;
			}
			aiTurn();
			printMap();
			if (checkWin(DOT_O)) {
				System.out.println("Победил Скайнет!");
				break;
			}
			if (isMapFull()){
				break;
			}
		}
		System.out.println("Game Over");
	}
	
	//Инициализация поля
	public static void initMap() {
		map = new char[SIZE][SIZE];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = DOT_EMPTY;
			}
		}
	}
	
	//Рисуем поле
	public static void printMap() {
		//Нумеруем строку
		for (int i = 0; i <= map.length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		//Выводим строки поля
		for (int i = 0; i < map.length; i++) {
			//Нумеруем столбец
			System.out.print((i + 1) + " ");
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//Ход человека
	public static void humanTurn() {
		int line, col;
		do {
			System.out.println("Введите координаты X(по горизонтали) и Y(по вертикали)");
			line = SCANNER.nextInt() - 1;
			col = SCANNER.nextInt() - 1;
		} while (! isCellValid(line, col));
		map[line][col] = DOT_X;
	}
	
	//Ход AI
	public static void aiTurn() {
		int line, col;
		do {
			line = RANDOM.nextInt(SIZE);
			col = RANDOM.nextInt(SIZE);
		} while (! isCellValid(line, col));
		System.out.println("*AI делает ход в: " + (line + 1) + " по горизонтали" + " " + (col + 1) + " по вертикали");
		map[line][col] = DOT_O;
	}
	
	/**
	 * Проверка кто выиграл.
	 * @param symbol Символ для которого проверяем. Крестик или Нолик
	 * @return true, если выиграл.
	 */
	public static boolean checkWin(char symbol) {
		//Строки
		if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) {
			return true;
		}
		if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) {
			return true;
		}
		if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) {
			return true;
		}
		//Столбцы
		if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) {
			return true;
		}
		if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) {
			return true;
		}
		if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) {
			return true;
		}
		//Диагонали
		if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) {
			return true;
		}
		if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) {
			return true;
		}
		return false;
	}
	
	/**
	 * Проверка заполнено ли поле полностью
	 *
	 * @return true, если нет ни одной свободной клетки
	 */
	public static boolean isMapFull() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == DOT_EMPTY) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Проверка введеных пользователем координат
	 *
	 * @param line координата оси Х
	 * @param col  координата оси Y
	 * @return true/false
	 */
	public static boolean isCellValid(int line, int col) {
		if (line < 0 || line > SIZE || col < 0 || col > SIZE) {
			return false;
		}
		return map[line][col] == DOT_EMPTY;
	}
}
