package course2.lesson1.homework1;

public class Human implements Playable {
	private final int runLimit;
	private final int jumpLimit;
	
	public Human(int runLimit, int jumpLimit) {
		this.runLimit = runLimit;
		this.jumpLimit = jumpLimit;
	}
	
	@Override
	public boolean jump(int height) {
		if (jumpLimit < height) {
			System.out.println("Человек не смог перепрыгнуть стену ");
			return false;
		}
		System.out.println("Человек перепрыгнул стену! ");
		return true;
	}
	
	@Override
	public boolean run(int distance) {
		if (runLimit < distance) {
			System.out.println("Человек не смог пробежать дистанцию ");
			return false;
		}
		System.out.println("Человек смог пробежать дистанцию! ");
		return true;
	}
	
}