package test;

import java.util.Scanner;
import main.Food;
import main.Gamesoart;
import main.Pet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		Gamesoart Gm = new Gamesoart();
		Pet pet=new Pet("PK",600,100,300,1000);
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
			System.out.println("请选择:");
			int clos = scanner.nextInt();
			switch (clos) {
			case 1: {
				if (Gm.getMyPet() == null) {
					System.out.println("\t"+"游戏商店"+"\t");
					System.out.println("1.领养宠物\t2.购买食物");
					System.out.println("请选择:");
					int t =scanner.nextInt();
					if (t == 1) {
						Pet[] ps = Gm.getpetSoart();
						for (int i = 0; i < ps.length; i++) {
							System.out.print((i+1)+"."+ ps[i].getName() +"\t");
						}
						System.out.println("\n请选择:");
						do {
							t = scanner.nextInt();
							if (0 < t && t <= Gm.getpetSoart().length) {
								Gm.setMyPet(ps[t-1]);
							}else {
								System.out.println("输入错误请重新输入:");
							}			
						} while (!(0 < t && t <= Gm.getpetSoart().length));
						System.out.println("成功领养"+Gm.getpetSoart()[t-1].getName());
					}
				}
				break;
			}
			case 2: {
				
				break;
			}
			case 3: {
				
				break;
			}
			case 4: {
				
				break;
			}
			case 5: {
				
				break;
			}
			case 6: {
				
				break;
			}
			case 7: {
				break;
			}
			case 8: {
				pet.sleep();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + clos);
			}
		}
//		Pet pet=new Pet("PK",600,100,300,1000);
//		Food food=new Food("牛奶",100,100);
//		pet.eat(food);
//		pet.display();
//		pet.talk();
	}
}
