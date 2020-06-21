package Robot;

public class SuccessfulRobotConnectionCloseNo extends RobotConnnectionCl {
	@Override
	public void moveRobotTo(int x, int y) {
		Robot.toX = x;
		Robot.toY = y;
	}

	@Override
	public void close() throws Exception {
		throw new RobotConnectionException("закрытие хорошего соединения");
	}
}
