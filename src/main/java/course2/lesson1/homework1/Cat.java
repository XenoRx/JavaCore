package course2.lesson1.homework1;

public class Cat implements Playable {
	private final int runLimit;
	private final int jumpLimit;
	
	public Cat(int runLimit, int jumpLimit) {
		this.runLimit = runLimit;
		this.jumpLimit = jumpLimit;
	}
	
	@Override
	public boolean jump(int height) {
		if (jumpLimit < height) {
			System.out.println("Кошка не смогла перепрыгнуть стену ");
			return false;
		}
		System.out.println("Кошка смогла перепрыгнуть стену! ");
		return true;
	}
	
	@Override
	public boolean run(int distance) {
		if (runLimit < distance) {
			System.out.println("Кошка не смогла пробежать дистанцию ");
			return false;
		}
		System.out.println("Кошка смогла пробежать дистанцию! ");
		return true;
	}
}
