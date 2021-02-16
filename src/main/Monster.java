package main;

import java.util.Random;

public class Monster {
	private String name; //怪物名称
	private int life;	//生命力
	private int attack;	//攻击力
	private int defense;//防御力
	private String[] sttackWay;	//攻击方式
	
	public Monster(){
		String[] sw = {  "凤翅天翔",
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
		switch (new Random().nextInt(2)) {
			case 0:
				this.name = "嗜血山妖";
				this.life = 10000;
				this.attack = 120;
				this.defense = 100;
				this.sttackWay = sw;
				break;
			case 1:
				this.name = "魅影妖狐";
				this.life = 20000;
				this.attack = 220;
				this.defense = 200;
				this.sttackWay = sw;
				break;
			case 2:
				this.name = "巡山山妖";
				this.life = 15000;
				this.attack = 100;
				this.defense = 10;
				this.sttackWay = sw;
				break;
			default:
				break;
		}
	}

	// public Monster() {
	// 	Monster[] monsters = new Monster[3];
	// 	monsters[0].setName("嗜血山妖");
	// 	monsters[0].setAttack(120);
	// 	monsters[0].setDefense(100);
	// 	monsters[0].setLife(300);
	// 	String[] SttackWay = {  "凤翅天翔",
	// 							"凤舞九天",
	// 							"有凤来仪",
	// 							"百鸟朝凤",
	// 							"龙飞凤舞",
	// 							"龙飞凤舞",
	// 							"见龙在田",
	// 							"飞龙在天",
	// 							"亢龙有悔",
	// 							"神龙摆尾"
	// 							};
	// 	monsters[0].setSttackWay(SttackWay);
	// 	monsters[1].setName("魅影妖狐");
	// 	monsters[1].setAttack(220);
	// 	monsters[1].setDefense(200);
	// 	monsters[1].setLife(300);
	// 	monsters[1].setSttackWay(SttackWay);
	// 	monsters[1].setName("巡山山妖");
	// 	monsters[1].setAttack(100);
	// 	monsters[1].setDefense(10);
	// 	monsters[1].setLife(100);
	// 	monsters[1].setSttackWay(SttackWay);
	// 	return monsters[new Random().nextInt(2)];
	// }

	public void hit(Pet pet){
		System.out.println("怪物使出了[" +this.sttackWay[new Random().nextInt(this.sttackWay.length)]+"]");	//随机产生一个攻击并显示
		if ((this.attack - pet.getDefense()) > 0) {
			pet.setSinew(pet.getSinew()-(this.attack - pet.getDefense()));	//	宠物体力 = 宠物体力 - （怪物攻击力 - 宠物防御力）
			System.out.println("宠物消耗了["+ (this.attack - pet.getDefense()) +"]点体力");
		}else{
			pet.setSinew(pet.getSinew()-1);
			System.out.println("宠物消耗了[1]点体力");
		}
		if (pet.getSinew() <= 0) {
			System.out.println("地球上失踪的宠物又多了一个");
			System.out.println("Game over!");
			System.exit(0);
		}
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public String[] getSttackWay() {
		return sttackWay;
	}
	public void setSttackWay(String[] sttackWay) {
		this.sttackWay = sttackWay;
	}
	
}
