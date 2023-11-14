package June2023Q4;

public class LaunchMissile implements MissileOperation{

	@Override
	public void initiateOperation(String location) {
		System.out.println("Missile launch initiated from"+location);
	}

}
