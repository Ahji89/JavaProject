package src;

public class Animal {
	String name;
	int weight;
	static String id = "abcd";
	
	Animal(){
		name = "����";
		weight = 400;
		print();
	}
	
	Animal(String a, int b){
		name = a;
		weight = b;
		print();
	}
	
	Animal(Animal copy){
		name = copy.name;
		weight = copy.weight;
	}
	
	int add(int i){
		weight += i;
		return weight;
	}
	
	int sub(int i){
		if(i < weight)
			weight -= i;
		else
			weight = i - weight;
		
		return weight;
	}
	
	void print(){
		System.out.println("�̸� : " + name + ", ������ : " + weight + "kg");
	}
	
	void print(String ani){
		System.out.println("\"" + name + "\" ��(��) " + ani + "�Դϴ�.");
	}
	
	String setName(String a){
		name = a;
		return name;
	}
	
	int setWeight(int b){
		weight = b;
		return weight;
	}
	
	/*static String name;
	static int weight;
	
	static String setName(String setName){
		name = setName;
		return name;
	}
	
	static int setWeight(int setWeight){
		weight = setWeight;
		return weight;
	}
	
	static void print(){
		String ani = "������";
		System.out.println("\"" + name + "\" ��(��) " + ani + "�Ӵϴ�.");
	}*/
}