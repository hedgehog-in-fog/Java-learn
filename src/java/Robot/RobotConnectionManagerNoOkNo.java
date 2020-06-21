package Robot;

public class RobotConnectionManagerNoOkNo extends RobotConnectionManagerCl {
	int count;
	@Override
	public RobotConnection getConnection() {
		count++;
		if(count == 1) return new BrokenRobotConnection();
		if(count == 2) return  new SuccessfulRobotConnection();
		if(count == 3) {
			count = 0;
			return new UnSuccessfulRobotConnection();
		}

		return null;
	}
}
