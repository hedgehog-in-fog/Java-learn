package Robot;

public class BrokenRobotConnection extends RobotConnnectionCl {
	@Override
	public void moveRobotTo(int x, int y) {
		throw new RobotConnectionException("Connection interrupted");
	}
}
