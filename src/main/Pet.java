package main;

import java.util.Random;

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
	
	/**
	 * 初始化构造方法
	 * @param name//姓名
	 * @param sinew//体力
	 * @param power//力量
	 * @param mind//智力
	 * @param money//金钱
	 */
	public Pet(String name,int sinew,int power,int mind,int money) {
		this.name =name;
		this.sinew=sinew;
		this.power=power;
		this.mind=mind;
		this.attack=power*10;
		this.defense=mind*3;
		this.money=money;
		this.initlanguage();
		this.initattackWay();
	}
	
	
	/**
	 * 判断是否死亡
	 * @return
	 * 1 死亡
	 * 0 未死亡
	 */
	public boolean isDead() {
		if (sinew<=0) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 进食
	 * @param food
	 */
	public void eat(Food food) {
		if (this.money < food.getPeice()) {
			System.out.println("你太穷了，我们不招待穷鬼！");
			return;
		}
		if (this.sinew < 400) {
			System.out.println("您的宝宝病了，根本没有食欲，还是去医院吧！");
			return;
		}
		if (this.sinew == 1000) {
			System.out.println("您的宝宝太饱了，不能再吃了，要撑死的，小心！");
			return;
		}
		System.out.println("这次吃的是"+food.getFoodname());
		System.out.println(this.name+"正在幸福的用餐,香香香,真香,还想吃!");
		System.out.println("食物的体力值:"+food.getSinew());
		System.out.println("当前宠物的体力值:"+this.sinew);
		if ((this.sinew+food.getSinew()) > 1000) {
			System.out.println("恢复体力值:"+(1000-this.sinew));
			this.sinew = 1000;
		}else {
			System.out.println("恢复体力值:"+food.getSinew());
			this.sinew+=food.getSinew();			
		}
		System.out.println("花费金币数:"+food.getPeice());
		this.money-=food.getPeice();
	}
	
	/**
	 * 聊天
	 */
	public void talk() {
		System.out.println(this.language[new Random().nextInt(20)]);
	}
	
	public void sleep() {
		String[] sleep= {"忙了一天，终于可以休息了，zzzzzzzzzzzzzzzz........","梦境：哇，大火腿，我要吃大火腿，咔..........!","清晨：败家的宝宝，快醒醒，咬到我的腿了！"};
		for (int i = 0; i < sleep.length; i++) {
			System.out.println(sleep[i]);
		}
		if (this.sinew == 1000) {
			System.out.println("新的一天开始了,宝宝现在体力值是满的");
			return;
		}
		if (this.sinew+50>1000) {
			System.out.println("新的一天开始了,恢复了"+(1000-this.sinew)+"点的体力值,当前体力值1000.");
		} else {
			System.out.println("新的一天开始了,恢复了50点的体力值,当前体力值"+(this.sinew+=50));
		}
	}
	
	public void hit(Monster monster){
		//随机输出攻击方法
		System.out.println("宠物使出了["+this.attackWay[new Random().nextInt(this.attackWay.length - 1)]+"]");
		if (this.attack > monster.getDefense()) {
			monster.setDefense(monster.getLife()-this.attack-monster.getDefense());
			System.out.println("怪物消耗了["+(this.attack-monster.getDefense())+"]点体力");
		}else {
			System.out.println("怪物消耗了[1]点体力");
			monster.setLife(monster.getLife()-1);
		}
		if (monster.getLife()<=0) {
			System.out.println("战斗胜利:消灭怪物" + monster.getName());
		}
	}
	
	private void initattackWay() {
		this.attackWay=new String[13];
		this.attackWay[0]="震山掌";
		this.attackWay[1]="毒砂掌";
		this.attackWay[2]="玄冥掌";
		this.attackWay[3]="铁沙掌";
		this.attackWay[4]="红砂掌";
		this.attackWay[5]="截心掌";
		this.attackWay[6]="七伤拳";
		this.attackWay[7]="灵宝拳";
		this.attackWay[8]="破玉拳";
		this.attackWay[9]="上清拳";
		this.attackWay[10]="太极拳";
		this.attackWay[11]="沐家拳";
		this.attackWay[12]="伏虎拳";
	}
	
	public void setAttackWay(String[] attackWay) {
		this.attackWay = attackWay;
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
