package test;

import main.Food;
import main.Pet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet=new Pet("PK",600,100,300,1000);
		Food food=new Food("牛奶",100,100);
		pet.eat(food);
		pet.display();
		pet.talk();
	}
}
