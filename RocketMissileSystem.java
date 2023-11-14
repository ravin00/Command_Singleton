package June2023Q4;

public class RocketMissileSystem implements MissileSystem {
	
	private static RocketMissileSystem instance;
	
	private RocketMissileSystem() {
		
		
	}
	
	public static synchronized RocketMissileSystem getInstance() {
		
		if(instance == null) {
			
			instance = new RocketMissileSystem();
			System.out.println("Initialize rocket missile system");
		}
		
		return instance;
	}

	@Override
	public void launch(String Source) {
		System.out.println("Rocket Missile Launch From " + Source);
		
	}

	@Override
	public void blast(String destination) {
		System.out.println("Rocket Missile Blast From " + destination);
		
	}

}
