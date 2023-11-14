package June2023Q4;

public class Test {

	public static void main(String[] args) {
		MissileSystem heatMissileSystem = HeatMissileSystem.getInstance();
		heatMissileSystem.launch("Colombo");
		heatMissileSystem.blast("Flight LH370");
		
		MissileSystem rocketMissileSystem = RocketMissileSystem.getInstance();
		rocketMissileSystem.launch("Kandy");
		rocketMissileSystem.blast("Flight LH420");
		
		MissileController missileController = MissileController.getInstance();
		missileController.perfromLaunching("Colombo");
		missileController.performBlasting("Kandy");
	}

}