package src;

import src.Animal;

public class Ani_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Animal cat = new Animal();
		Animal dog = new Animal();
		Animal elephant = new Animal();
		
		cat.name = "냥이";
		cat.weight = 300;
		
		dog.name = "멍돌이";
		dog.weight = 500;
		
		elephant.name = "코돌이";
		elephant.weight = 15000;
		
		cat.setName("냥이");
		cat.setWeight(300);
		
		dog.setName("멍돌이");
		dog.setWeight(500);
		
		elephant.setName("코끼리");
		elephant.setWeight(15000);
		
		System.out.println("고양이 이름 : " + cat.name + ", 고양이 몸무게 : " + cat.weight + "kg");
		System.out.println("강아지 이름 : " + dog.name + ", 강아지 몸무게 : " + dog.weight + "kg");
		System.out.println("코끼리 이름 : " + elephant.name + ", 코끼리 몸무게 : " + elephant.weight + "kg");*/
		
		/*Animal.name = "냥이";
		Animal.weight = 300;
		
		Animal.name = "멍돌이";
		Animal.weight = 500;
		
		Animal.name = "코돌이";
		Animal.weight = 15000;
		
		Animal.setName("냥이");
		Animal.setWeight(200);
		
		System.out.println("고양이 이름 : " + Animal.name + ", 고양이 몸무게 : " + Animal.weight + "kg");
		
		Animal.setName("멍돌이");
		Animal.setWeight(600);
		
		System.out.println("강아지 이름 : " + Animal.name + ", 강아지 몸무게 : " + Animal.weight + "kg");
		
		Animal.setName("코끼리");
		Animal.setWeight(12000);
		
		System.out.println("코끼리 이름 : " + Animal.name + ", 코끼리 몸무게 : " + Animal.weight + "kg");*/
		
		/*Animal.setName("냐옹이");
		Animal.setWeight(200);
		Animal.print();
		
		Animal.name = "길냥이";
		Animal.weight = 250;
		Animal.print();*/
		
		/*Animal cat1 = new Animal("냥이", 150);
		System.out.println("고양이 이름 : " + cat1.name + ", 고양이 몸무게 : " + cat1.weight + "kg");
		
		Animal cat2 = new Animal(cat1);
		cat2.name = "길냥이";
		System.out.println("고양이 이름 : " + cat2.name + ", 고양이 몸무게 : " + cat2.weight + "kg");*/
		
		Animal cat = new Animal();
		cat.add(-50);
		cat.print();
		cat.sub(50);
		cat.print();
		
		Animal dog = new Animal("멍뭉이", 500);
		dog.setName("강아지");
		dog.print();
		
		Animal elephant = new Animal();
		elephant.setName("코돌이");
		elephant.setWeight(13000);
		elephant.print();
		
		Animal mini_elephant = new Animal(elephant);
		mini_elephant.weight = 6000;
		mini_elephant.print();
		
		System.out.println();
		cat.print("고양이");
		dog.print("강아지");
		elephant.print("코끼리");
		mini_elephant.print("코끼리");
	}

}
