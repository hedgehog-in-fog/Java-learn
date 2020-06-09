package Robot;

public class TestRobotConnection {
	public static Robot robot = new Robot(0, 0);

	public static void main(String[] args) {

		RobotConnectionManagerCl robotConnectionManager = new RobotConnectionManagerOk();
		RobotConnectionManagerCl robotConnectionManagerCl = new RobotConnectionManagerNoNoOk();
		RobotConnectionManager robotConnectionManagerNo = new  RobotConnectionManagerNo();
		moveRobot(robotConnectionManagerNo, 8, 5);
		robot.robotTo();
		System.out.println(robot.getX() + " " + robot.getY());
	}

	public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
		boolean noConnect = true;
		int error = 0;
		int i = 0;
		while (i < 3 & noConnect) {
			try (RobotConnection rc = robotConnectionManager.getConnection()) {
				i++;
				rc.moveRobotTo(toX, toY);
				noConnect = false;

			} catch (RobotConnectionException e) {
				noConnect = true;
				System.out.println(e.getMessage());
				error++;
				if (error == 3) {
					throw new RobotConnectionException("не удалось установить соединение", e);
				}
			}
		}
	}

}
