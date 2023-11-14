package June2023Q4;

public class HeatMissileSystem implements MissileSystem{
	
	private static HeatMissileSystem instance;
	
	private HeatMissileSystem() {
		
	}
	
	public static synchronized HeatMissileSystem getInstance() {
		
		if(instance == null) {
			instance = new HeatMissileSystem();
			System.out.println("Initialized Heat Missile System ");
		}
		
		return instance;
	}

	@Override
	public void launch(String Source) {
		System.out.println("Heat Missile Launch From" + Source);
		
	}

	@Override
	public void blast(String destination) {
		System.out.println("Heat Missile Blast From" + destination);
		
	}
}
