package Robot;

public abstract class RobotConnnectionCl implements RobotConnection{
	@Override
	public abstract void moveRobotTo(int x, int y);

	@Override
	public void close() {
	}
}
