package Robot;

public class SuccessfulRobotConnection extends RobotConnnectionCl {

	@Override
	public void moveRobotTo(int x, int y) {
		Robot.toX = x;
		Robot.toY = y;
	}

}
