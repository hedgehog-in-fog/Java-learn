package Robot;

public class Robot {
	public static int toX;
	public  static int toY;
	private int x;
	private int y;

	public Robot(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void robotTo(){
		setX(toX);
		setY(toY);
	}
}
