package course2.lesson1.homework1;

public class Treadmill implements ObstacleTreadmill {
	private int distance;
	
	public Treadmill(int distance) {
		this.distance = distance;
	}
	
	@Override
	public void overcomeT(Playable runner) {
		runner.run(distance);
	}
}
