package Robot;

public class RobotConnectionManagerNoNoOk extends  RobotConnectionManagerCl{
	int count;
	@Override
	public RobotConnection getConnection() {
		count++;
		if(count == 1) return new UnSuccessfulRobotConnection();
		if(count == 2) return  new BrokenRobotConnection();
		if(count == 3) {
			count = 0;
			return new SuccessfulRobotConnection();
		}

		return null;
	}
}
