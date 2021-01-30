package test;

import java.util.Scanner;
import main.Food;
import main.Pet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		Pet pet=new Pet("PK",600,100,300,1000);
		while(true) {
			System.out.println("电子宠物系统");
			System.out.println("1.宠物领养");
			System.out.println("2.宠物聊天");
			System.out.println("3.宠物喂食");
			System.out.println("4.宠物睡觉");
			System.out.println("5.进入战场");
			System.out.println("6.查看宠物状态");
			System.out.println("7.退出");
			System.out.println("8.测试");
			System.out.println("请选择:");
			int clos = scanner.nextInt();
			switch (clos) {
			case 1: {
				
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
