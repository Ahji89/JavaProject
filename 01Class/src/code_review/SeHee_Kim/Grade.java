package code_review.SeHee_Kim;

public class Grade {
	// �л��̸�
	String name;
	// ����������
	int infoCom;
	int comArc;
	int dataStr;
	// �հ�, ���
	int total;
	float average = total/3;
	
	Grade(String name, int infoCom, int comArc, int dataStr){
		this.name = name;
		this.infoCom = infoCom;
		this.comArc = comArc;
		this.dataStr = dataStr;
		this.total = infoCom + comArc + dataStr;
		this.average = total/3;
	}
	
	public void printTotal(){
		System.out.println(name + "�л��� ���� : " + total);
	}
	
	public void printAverage(){
		System.out.println(name + "�л��� ��� : " + average);
	}
	
	public void printScore(){
		System.out.println(name + "�л��� ������ ����");
		System.out.println("  ������Ű��� : " + infoCom);
		System.out.println("  ��ǻ�ͱ��� : " + comArc);
		System.out.println("  �ڷᱸ�� : " + dataStr);
	}
	
	public void printGrade(){
		System.out.println(name + "�л��� ������ ����");
		System.out.println("  ������Ű��� : " + calculGrade(infoCom));
		System.out.println("  ��ǻ�ͱ��� : " + calculGrade(comArc));
		System.out.println("  �ڷᱸ�� : " + calculGrade(dataStr));
	}
	
	public char calculGrade(int value){
		char grade;
		if(value <= 100 && value >= 91){
			grade = 'A';
		}else if(value < 91 && value >= 81){
			grade = 'B';
		}else if(value < 81 && value >= 71){
			grade = 'C';
		}else if(value < 71 && value >= 61){
			grade = 'D';
		}else{
			grade = 'F';
		}
		return grade;
	}
}
