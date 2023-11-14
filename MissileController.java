package June2023Q4;

public class MissileController {

    private static MissileController instance;

    private MissileController() {

    }

    public static synchronized MissileController getInstance() {
        if (instance == null) {
            instance = new MissileController();
            System.out.println("Initialize Missile controller....");
        }
        return instance;
    }

    public void perfromLaunching(String start) {
        LaunchMissile launchMissile = new LaunchMissile();
        launchMissile.initiateOperation(start);
    }

    public void performBlasting(String end) {
        BlastMissile blastMissile = new BlastMissile();
        blastMissile.initiateOperation(end);
    }
}
