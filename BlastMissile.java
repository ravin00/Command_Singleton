package June2023Q4;

public class BlastMissile implements MissileOperation {

	@Override
	public void initiateOperation(String location) {
		System.out.println("Missile blast initiated from" + location);
		
	}
	
}
