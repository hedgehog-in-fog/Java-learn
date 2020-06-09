package Robot;

public class UnSuccessfulRobotConnection extends RobotConnnectionCl  {
	@Override
	public void moveRobotTo(int x, int y) {
		throw new  RobotConnectionException("no connection");
	}
}
