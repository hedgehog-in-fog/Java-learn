package Robot;

public class RobotConnectionManagerNo extends RobotConnectionManagerCl{
	@Override
	public RobotConnection getConnection() {
		RobotConnection robotConnection = new UnSuccessfulRobotConnection();
		return robotConnection;

	}
}
