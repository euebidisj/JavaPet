package main;

public class Monster {
	private String name; //怪物名称
	private int life;	//生命力
	private int attack;	//攻击力
	private int defense;//防御力
	private String[] sttackWay;	//攻击方法
	
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
