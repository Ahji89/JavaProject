package src;

import src.Animal;

public class Ani_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Animal cat = new Animal();
		Animal dog = new Animal();
		Animal elephant = new Animal();
		
		cat.name = "����";
		cat.weight = 300;
		
		dog.name = "�۵���";
		dog.weight = 500;
		
		elephant.name = "�ڵ���";
		elephant.weight = 15000;
		
		cat.setName("����");
		cat.setWeight(300);
		
		dog.setName("�۵���");
		dog.setWeight(500);
		
		elephant.setName("�ڳ���");
		elephant.setWeight(15000);
		
		System.out.println("������ �̸� : " + cat.name + ", ������ ������ : " + cat.weight + "kg");
		System.out.println("������ �̸� : " + dog.name + ", ������ ������ : " + dog.weight + "kg");
		System.out.println("�ڳ��� �̸� : " + elephant.name + ", �ڳ��� ������ : " + elephant.weight + "kg");*/
		
		/*Animal.name = "����";
		Animal.weight = 300;
		
		Animal.name = "�۵���";
		Animal.weight = 500;
		
		Animal.name = "�ڵ���";
		Animal.weight = 15000;
		
		Animal.setName("����");
		Animal.setWeight(200);
		
		System.out.println("������ �̸� : " + Animal.name + ", ������ ������ : " + Animal.weight + "kg");
		
		Animal.setName("�۵���");
		Animal.setWeight(600);
		
		System.out.println("������ �̸� : " + Animal.name + ", ������ ������ : " + Animal.weight + "kg");
		
		Animal.setName("�ڳ���");
		Animal.setWeight(12000);
		
		System.out.println("�ڳ��� �̸� : " + Animal.name + ", �ڳ��� ������ : " + Animal.weight + "kg");*/
		
		/*Animal.setName("�Ŀ���");
		Animal.setWeight(200);
		Animal.print();
		
		Animal.name = "�����";
		Animal.weight = 250;
		Animal.print();*/
		
		/*Animal cat1 = new Animal("����", 150);
		System.out.println("������ �̸� : " + cat1.name + ", ������ ������ : " + cat1.weight + "kg");
		
		Animal cat2 = new Animal(cat1);
		cat2.name = "�����";
		System.out.println("������ �̸� : " + cat2.name + ", ������ ������ : " + cat2.weight + "kg");*/
		
		Animal cat = new Animal();
		cat.add(-50);
		cat.print();
		cat.sub(50);
		cat.print();
		
		Animal dog = new Animal("�۹���", 500);
		dog.setName("������");
		dog.print();
		
		Animal elephant = new Animal();
		elephant.setName("�ڵ���");
		elephant.setWeight(13000);
		elephant.print();
		
		Animal mini_elephant = new Animal(elephant);
		mini_elephant.weight = 6000;
		mini_elephant.print();
		
		System.out.println();
		cat.print("������");
		dog.print("������");
		elephant.print("�ڳ���");
		mini_elephant.print("�ڳ���");
	}

}