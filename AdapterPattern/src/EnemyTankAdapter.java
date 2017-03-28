
public class EnemyTankAdapter implements EnemyAttack {

	EnemyTank newtank;

	public EnemyTankAdapter(EnemyTank newTank)
	{
		newtank = newTank;
	}
	
	@Override
	public void smashWithHands() {

		newtank.fireWeapon();

	}

	@Override
	public void walkForward() {

		newtank.driveForward();
	}

	@Override
	public void reactToHuman(String drivername) {

		newtank.assignDriver(drivername);

	}

}
