package Robot;

public class RobotConnectionManagerNoNoOkCloseNo extends RobotConnectionManagerCl {
	int count = 0;
	@Override
	public RobotConnection getConnection() {
		count++;
		if(count == 1) return new UnSuccessfulRobotConnection();
		if(count == 2) return  new UnSuccessfulRobotConnection();
		if(count == 3) {
			count = 0;
			return new SuccessfulRobotConnectionCloseNo();
		}

		return null;
	}
}
