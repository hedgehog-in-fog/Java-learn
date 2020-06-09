package Robot;

public class RobotConnectionManagerOk extends RobotConnectionManagerCl {
	@Override
	public RobotConnection getConnection() {
		RobotConnection robotConnection = new SuccessfulRobotConnection();
			return robotConnection;

	}
}
