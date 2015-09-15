package code_review.HyeYeon_Cho;

public class Student {
	String jeongtong = "������Ű���";
	String comgu = "��ǻ�ͱ���";
	String jaryo = "�ڷᱸ��";
	String name;
	int jeongtongJumsu, comguJumsu, jaryoJumsu, sum;
	float avg;
	String str_avg;
	
	Student(String name, int jeongtongJumsu, int comguJumsu, int jaryoJumsu){
		this.name = name;
		this.jeongtongJumsu = jeongtongJumsu;
		this.comguJumsu = comguJumsu;
		this.jaryoJumsu = jaryoJumsu;
	}
	
	int sum(){
		sum = jeongtongJumsu + comguJumsu + jaryoJumsu;
		return sum;
	}
	
	float avg(){
		avg = Math.round(sum / 3);
		return avg;
	}
	
	String stravg(){
		if(avg > 90)
			str_avg = "A";
		else if(90 <= avg && avg > 80)
			str_avg = "B";
		else if(80 <= avg && avg > 70)
			str_avg = "C";
		else if(70 <= avg && avg > 60)
			str_avg = "D";
		else
			str_avg = "F";
		
		return str_avg;
	}
	
	void print(){
		System.out.println("�̸� : " + name);
		System.out.println(jeongtong + " : " + jeongtongJumsu + "��, " + comgu + " : " + comguJumsu + "��, " + jaryo + " : " + jaryoJumsu + "��");
		System.out.println("���� : " + sum() + "��, ���� : " + avg() + "��, ��� ���� : " + stravg());
		System.out.println();
	}
}
