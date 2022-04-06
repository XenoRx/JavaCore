package course2.lesson1.homework1;

import java.util.Arrays;

public class ConsoleApp {
	public static void main(String[] args) {
		Playable[] players = new Playable[3];
		players[0] = new Human(205, 105);
		players[1] = new Cat(305, 110);
		players[2] = new Robot(400, 505);
		
		Wall[] walls = new Wall[1];
		walls[0] = new Wall(500);
		
		Treadmill[] treadmills = new Treadmill[1];
		treadmills[0] = new Treadmill(300);
		
		for (Wall wall : walls) {
			for (Playable player : players) {
				wall.overcomeW(player);
			}
		}
		System.out.println("=============================");
		
		for (Treadmill treadmill : treadmills) {
			for (Playable player : players) {
				treadmill.overcomeT(player);
			}
		}
		/*Cat cat1 = new Cat(); // как делать не надо:D
		Human human1 = new Human();
		Robot robot1 = new Robot();
		Wall wall = new Wall(30);
		Treadmill treadmill = new Treadmill(25);
		human1.jump(10);
		human1.run(20);
		cat1.jump(10);
		cat1.run(20);
		robot1.jump(10);
		robot1.run(20);*/
	}
}