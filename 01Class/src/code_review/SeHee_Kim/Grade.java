package code_review.SeHee_Kim;

public class Grade {
	// 학생이름
	String name;
	// 교과목점수
	int infoCom;
	int comArc;
	int dataStr;
	// 합게, 평균
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
		System.out.println(name + "학생의 총점 : " + total);
	}
	
	public void printAverage(){
		System.out.println(name + "학생의 평균 : " + average);
	}
	
	public void printScore(){
		System.out.println(name + "학생의 교과목별 점수");
		System.out.println("  정보통신개론 : " + infoCom);
		System.out.println("  컴퓨터구조 : " + comArc);
		System.out.println("  자료구조 : " + dataStr);
	}
	
	public void printGrade(){
		System.out.println(name + "학생의 교과목별 학점");
		System.out.println("  정보통신개론 : " + calculGrade(infoCom));
		System.out.println("  컴퓨터구조 : " + calculGrade(comArc));
		System.out.println("  자료구조 : " + calculGrade(dataStr));
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
