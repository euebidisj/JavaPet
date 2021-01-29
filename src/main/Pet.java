package main;

/**
 *宠物类
 * @author lee
 *
 */
public class Pet {
	private String name;	//姓名
	private int sinew;	//体力
	private int power;	//力量
	private int mind;	//智力
	private int attack;	//攻击 = power * 10
	private int defense;//防御 = mind * 3
	private int money;	//金钱
	
	public Pet(String name,int sinew,int power,int mind,int money) {
		this.name =name;
		this.sinew=sinew;
		this.power=power;
		this.mind=mind;
		this.attack=power*10;
		this.defense=mind*3;
		this.money=money;
	}
	public void display() {
		System.out.println("名字\t体力\t力量\t智力\t攻击\t防御\t金钱");
		System.out.println(this.name+"\t"+this.sinew+"\t"+this.power+"\t"+this.mind+"\t"+this.attack+"\t"+this.defense+"\t"+this.money);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSinew() {
		return sinew;
	}
	public void setSinew(int sinew) {
		this.sinew = sinew;
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
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
