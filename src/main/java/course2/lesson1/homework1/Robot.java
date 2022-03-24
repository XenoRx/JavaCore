package course2.lesson1.homework1;

public class Robot implements Playable {
	private final int runLimit;
	private final int jumpLimit;
	
	public Robot(int runLimit, int jumpLimit) {
		this.runLimit = runLimit;
		this.jumpLimit = jumpLimit;
	}
	
	@Override
	public boolean jump(int height) {
		if (jumpLimit < height) {
			System.out.println("Робот не смог перепрыгнуть стену ");
			return false;
		}
		System.out.println("Робот смог перепрыгнуть стену !");
		return true;
	}
	
	@Override
	public boolean run(int distance) {
		if (runLimit < distance) {
			System.out.println("Робот не смог пробежать дистанцию ");
			return false;
		}
		System.out.println("Робот смог пробежать дистанцию! ");
		return true;
	}
}
