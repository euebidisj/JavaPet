package main;

import java.util.Random;

public class War {
	private String warName;//战场的名称
	private int power;//要求的力量
	private int mind;//要求的智力
	private Monster[] monsters;//战场的怪物
	
	private int monsterNum = 5;//必须杀怪的数量
	private int maxMoney;//掉落金钱的最大值
	
	public War() {
		this.maxMoney = 50;
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
	
	public void waring(Pet pet) throws InterruptedException {
		if (!this.isComeIn(pet)) {
			System.out.println("该宠物因不满足条件无法进入战场!");
			return;
		}
		for (int i = 0; i < this.monsterNum; i++) {
			// Monster m1 = monsters[new Random().nextInt(monsters.length - 1)];
			Monster m1 = new Monster();
			System.out.println("怪物名称["+ m1.getName()+"]");
			while(m1.getLife() > 0 && pet.getSinew() > 0){
				Thread.currentThread();
				Thread.sleep(1000);
				m1.hit(pet);
				System.out.println("怪物攻击结束");
				pet.hit(m1);
				System.out.println("宠物攻击结束");
				System.out.println("----------------------------------");
			}
			pet.setMoney(pet.getMoney() + new Random().nextInt(this.maxMoney)); //掉落随机数额金钱
		}
	}

		
		
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
