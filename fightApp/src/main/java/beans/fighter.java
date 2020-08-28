package beans;

public class fighter {
	
	private int fighterId;
	private String name;
	private int attackPower;
	private int health;
	
	public fighter() {
		super();
	}
	
	public fighter(int fighterId, String name, int attackPower, int health) {
		super();
		this.fighterId = fighterId;
		this.name = name;
		this.attackPower = attackPower;
		this.health = health;
	}
	
	
	//GETTORS
	public  String getName() {
		return name;
	}
	
	public int getAttackPower() {
		return attackPower;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getFighterId() {
		return fighterId;
	}
	
	//SETTORS
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}

	public void setFighterId(int fighterId) {
		this.fighterId = fighterId;
	}
	

	@Override
	public String toString() {
		return "fighter [fighterId=" + fighterId + ", name=" + name + ", attackPower=" + attackPower + ", health=" + health + "]";
	}
	
	
	
}
