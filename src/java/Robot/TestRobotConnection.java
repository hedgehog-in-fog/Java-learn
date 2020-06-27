package Robot;

public class TestRobotConnection {
	public static Robot robot = new Robot(0, 0);

	public static void main(String[] args) {

		RobotConnectionManager robotConnectionManager = new RobotConnectionManagerOk();
		RobotConnectionManager robotConnectionManagerCl = new RobotConnectionManagerNoNoOk();
		RobotConnectionManager robotConnectionManagerNo = new RobotConnectionManagerNo();
		RobotConnectionManager robotConnectionManagerNoOkNo = new RobotConnectionManagerNoOkNo();
		RobotConnectionManager robotConnectionManagerNoNoOkCloseNo = new RobotConnectionManagerNoNoOkCloseNo();
//		moveRobot(robotConnectionManager, 8, 5);
//		robot.robotTo();
//		System.out.println(robot.getX() + " " + robot.getY());
	}

	public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
		boolean noConnect = true;
		int i = 0;
		while (i < 3 & noConnect) {
			i++;
			try (RobotConnection rc = robotConnectionManager.getConnection()) {
				rc.moveRobotTo(toX, toY);
				noConnect = false;
			} catch (RobotConnectionException e) {
				System.out.println(e.getMessage());
				if (noConnect && i == 3) {
					throw new RobotConnectionException("не удалось установить соединение", e);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
