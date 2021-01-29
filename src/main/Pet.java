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
	
	private String[] attackWay;	//攻击方式数组
	private String[] language;	//语言数组
	
	public Pet() {				//初始化
		this.initlanguage();
		this.initattackWay();
	}
	public Pet(String name,int sinew,int power,int mind,int money) {
		this.name =name;
		this.sinew=sinew;
		this.power=power;
		this.mind=mind;
		this.attack=power*10;
		this.defense=mind*3;
		this.money=money;
	}
	
	
	
	private void initattackWay() {
		this.attackWay=new String[13];
		this.attackWay[0]="震山掌";
		this.attackWay[0]="毒砂掌";
		this.attackWay[0]="玄冥掌";
		this.attackWay[0]="铁沙掌";
		this.attackWay[0]="红砂掌";
		this.attackWay[0]="截心掌";
		this.attackWay[0]="七伤拳";
		this.attackWay[0]="灵宝拳";
		this.attackWay[0]="破玉拳";
		this.attackWay[0]="上清拳";
		this.attackWay[0]="太极拳";
		this.attackWay[0]="沐家拳";
		this.attackWay[0]="伏虎拳";
		this.attackWay[0]="六合拳";
	}
	
	private void initlanguage() {
		this.language=new String[20];
		language[0]="你好，大帅哥主人，我今天心情不错，所以你就叫帅哥，嘎嘎！";
		language[1]="亲爱的主人，可怜可怜我吧，我都好几天没吃到肉了，能给个火腿吗？如果你不给，我就再也不工作了！";
		language[2]="天天打工好累啊！";
		language[3]="我要去冒险，冒险，冒险！";
		language[4]="我是天生的冒险家！";
		language[5]="主人，主人，你爱我吗？";
		language[6]="主人，我有个秘密，你想知道吗？";
		language[7]="如果你爱我，你就抱抱我，如果你爱我，你就亲亲我！";
		language[8]="现在已经进入IPHONE5时代，能给我买一台吗？";
		language[9]="Happy birthday to me！Happy birthday to me！没人理我，只能自己庆祝了！";
		language[10]="主人，如果我不在了，你会想我吗？";
		language[11]="主人，我要休息了，你别来烦我，呵呵！";
		language[12]="主人，你生气了吗？多久没有来看我了";
		language[13]="主人，我好饿啊，喂我点吃的吧";
		language[14]="主人，你的电话多少，有时间给你电话";
		language[15]="你是帅哥还是美女";
		language[16]="今天的天气不错啊，带我去兜风吧";
		language[17]="主人，你今天吃的什么啊，这么高兴";
		language[18]="我今天不吃饭了，心情不好,烦着呢，不要理我";
		language[19]="主人，我没有钱了，给我点钱花花吧";
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
