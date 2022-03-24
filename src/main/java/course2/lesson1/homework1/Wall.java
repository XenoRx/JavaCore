package course2.lesson1.homework1;

public class Wall implements ObstacleWall {
	private int height;
	
	public Wall(int height) {
		this.height = height;
	}
	
	@Override
	public void overcomeW(Playable jumper) {
		jumper.jump(height);
	}
}
