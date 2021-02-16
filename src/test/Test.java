package test;

import java.util.Scanner;
import main.Food;
import main.GameManager;
import main.Monster;
import main.Pet;
import main.War;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		GameManager Gm = new GameManager();
		while(true) {
			System.out.println("\t电子宠物系统");
			System.out.print("1.宠物领养\t");
			System.out.println("2.宠物聊天");
			System.out.print("3.宠物喂食\t");
			System.out.println("4.宠物睡觉");
			System.out.print("5.进入战场\t");
			System.out.println("6.查看宠物状态");
			System.out.print("7.退出\t\t");
			System.out.println("8.测试");
			System.out.print("请选择:");
			int clos = scanner.nextInt();
			switch (clos) {
			case 1: {
				if (Gm.getMyPet() == null) {
					System.out.println("\t"+"游戏商店"+"\t");
					int t;
						for (int i = 0; i < Gm.getpetSoart().length; i++) {
							System.out.print((i+1)+"."+ Gm.getpetSoart()[i].getName() +"\t");
						}
						System.out.print("\n请选择:");
						do {
							t = scanner.nextInt();
							if (0 < t && t <= Gm.getpetSoart().length) {
								Gm.setMyPet(Gm.getpetSoart()[t-1]);
							}else {
								System.out.println("输入错误请重新输入:");
							}			
						} while (!(0 < t && t <= Gm.getpetSoart().length));
						System.out.println("成功领养"+Gm.getpetSoart()[t-1].getName());
				}else {
					System.out.println("您已经领养过宠物,领养的宠物是["+Gm.getMyPet().getName()+"].不可再次领养.");
				}
				break;
			}
			case 2: {
				if (Gm.getMyPet() == null) {
					System.out.println("您还没有领养宠物哦!请先领养宠物.");
					break;
				}
				Gm.getMyPet().talk();
				break;
			}
			case 3: {
				if (Gm.getMyPet() == null) {
					System.out.println("您还没有领养宠物哦!请先领养宠物.");
					break;
				}
				System.out.println("\t游戏商店");
				for (int i = 0; i < Gm.getpetFood().length; i++) {
					System.out.print((i+1)+"."+Gm.getpetFood()[i].getFoodname()+"    ");
				}
				System.out.print("\n请选择:");
				int t;
				do {
					t = scanner.nextInt();
					if (0 < t && t <= Gm.getpetFood().length) {
						Gm.myPet.eat(Gm.getpetFood()[t-1]);
					}else {
						System.out.println("输入错误请重新输入:");
					}
				} while (!(0 < t && t <= Gm.getpetFood().length));
				break;
			}
			case 4: {
				if (Gm.getMyPet() == null) {
					System.out.println("您还没有领养宠物哦!请先领养宠物.");
					break;
				}
				Gm.getMyPet().sleep();
				break;
			}
			case 5: {
				if (Gm.getMyPet() == null) {
					System.out.println("您还没有领养宠物哦!请先领养宠物.");
					break;
				}
				War war = new War();
				if (!war.isComeIn(Gm.getMyPet())) {
					System.out.println("宠物无法进入战场");
					break;
				}
				war.waring(Gm.getMyPet());
				break;
			}
			case 6: {
				if (Gm.getMyPet() == null) {
					System.out.println("您还没有领养宠物哦!请先领养宠物.");
					break;
				}
				Gm.getMyPet().display();
				break;
			}
			case 7: {
				System.exit(0);
				break;
			}
			case 8: {
				// if (Gm.getMyPet() == null) {
				// 	System.out.println("您还没有领养宠物哦!请先领养宠物.");
				// 	break;
				// }
				// War war = new War();
				// if (!war.isComeIn(Gm.getMyPet())) {
				// 	System.out.println("宠物无法进入战场");
				// 	break;
				// }
				// war.waring(Gm.getMyPet());
				break;
			}
			default:
				System.out.println("输入错误!");
				break;
			}
		}
//		Pet pet=new Pet("PK",600,100,300,1000);
//		Food food=new Food("牛奶",100,100);
//		pet.eat(food);
//		pet.display();
//		pet.talk();
	}
}
