package main;

public class War {
	String warName;//战场的名称
	int power;//要求的力量
	int mind;//要求的智力
	Monster[] monsters;//战场的怪物
	
	int monsterNum = 5;//必须杀怪的数量
	int maxMoney;//掉落金钱的最大值
	
	public War() {
		initMonster();
	}
	
	public void initMonster() {
		this.monsters = new Monster[3];
		monsters[0].setName("嗜血山妖");
		monsters[0].setAttack(120);
		monsters[0].setDefense(100);
		monsters[0].setLife(300);
		String[] SttackWay = {  "凤翅天翔",
								"凤舞九天",
								"有凤来仪",
								"百鸟朝凤",
								"龙飞凤舞",
								"龙飞凤舞",
								"见龙在田",
								"飞龙在天",
								"亢龙有悔",
								"神龙摆尾"
								};
		monsters[0].setSttackWay(SttackWay);
		monsters[1].setName("魅影妖狐");
		monsters[1].setAttack(220);
		monsters[1].setDefense(200);
		monsters[1].setLife(300);
		monsters[1].setSttackWay(SttackWay);
		monsters[1].setName("巡山山妖");
		monsters[1].setAttack(100);
		monsters[1].setDefense(10);
		monsters[1].setLife(100);
		monsters[1].setSttackWay(SttackWay);
		

	}
	
	public void displsay() {
		System.out.println("战场名称\t要求力量\t要求智力\t须杀怪数\t掉落最大金钱数");
		System.out.println(this.warName+this.power+this.mind+this.monsterNum+this.maxMoney);
	}
	
	/**
	 * 判断宠物是否能进入战场
	 * @param pet
	 * @return	true false
	 */
	public boolean isComeIn(Pet pet) {
		if (pet.getPower() < this.power && pet.getMind() < this.mind) {
			return false;
		}
		return true;
	}
	
	public void waring(Pet pet){
		if (!this.isComeIn(pet)) {
			System.out.println("该宠物因不满足条件无法进入战场!");
			return;
		}
		for (int i = 0; i < monsters.length; i++) {
			
		}
	}

	// public void tt(Pet pet){
	// 	System.out.println("这是测试类");
	// }
		
		
	public String getWarName() {
		return warName;
	}
	public void setWarName(String warName) {
		this.warName = warName;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getMind() {
		return mind;
	}
	public void setMind(int mind) {
		this.mind = mind;
	}
	public Monster[] getMonsters() {
		return monsters;
	}
	public void setMonsters(Monster[] monsters) {
		this.monsters = monsters;
	}
	public int getMonsterNum() {
		return monsterNum;
	}
	public void setMonsterNum(int monsterNum) {
		this.monsterNum = monsterNum;
	}
	public int getMaxMoney() {
		return maxMoney;
	}
	public void setMaxMoney(int maxMoney) {
		this.maxMoney = maxMoney;
	}
	
}
