package main;

public class Gamesoart {
	public Pet[] petSoart;
	public Pet myPet;
	
	public Food[] petFood;
	
	public Pet getMyPet() {
		return myPet;
	}
/**
 * 获取宠物商店的宠物列表
 * @return	返回宠物对象数组首地址
 */
	public Pet[] getpetSoart() {
		return this.petSoart;
	}
	
	public Food[] getpetFood() {
		return petFood;
	}
	
	public Gamesoart() {	//默认构造方法 初始化宠物和食物信息
		setpetFood();
		setpetSoart();
	}
	
	public void setpetSoart() {
		this.petSoart = new Pet[3];
		this.petSoart[0] = new Pet("皮卡丘",590,900,200,3000);
		this.petSoart[1] = new Pet("喷火龙",630,700,2200,3000);
		this.petSoart[2] = new Pet("超梦",430,800,2100,3000);
		String[] ack = {
				"凤翅天翔",
				"凤舞九天",
				"有凤来仪",
				"百鸟朝凤",
				"龙飞凤舞"
		};
		String[] attackWay2= {
				"九阴真经",
				"北冥神功",
				"乾坤大挪",
				"天罗地网",
				"太玄神功"
		};
		this.petSoart[0].setAttackWay(ack);
		this.petSoart[1].setAttackWay(attackWay2);
	}
	
	public void setpetFood() {
		this.petFood = new Food[3];
		this.petFood[0]=new Food("恶魔果实",1000,500);
		this.petFood[1]=new Food("香蕉",100,50);
		this.petFood[2]=new Food("人参",500,250);
	}
	
	public void setMyPet(Pet myPet) {
		this.myPet = myPet;
	}
	
}
