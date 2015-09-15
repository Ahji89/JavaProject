package code_review.MinJeong_Lee;

public class Input {
	static String name;
	static int sub1;
	static int sub2;
	static int sub3;
	static int total;
	static int avg;
	static String grade1;
	static String grade2;
	static String grade3;
	
	Input(){
	}
	
	public int calTotal(){
		total = sub1 + sub2 + sub3;
		return total;
	}
	

	public int calAvg(){
		int avg = 0;
		avg = (sub1 + sub2 + sub3)/3;
		return avg;
	}
	
	public void result(){
		int total = calTotal();
		int avg = calAvg();
		
		grade1 = resultGrade(sub1);
		grade2 = resultGrade(sub2);
		grade3 = resultGrade(sub3);
		
		
		System.out.println("1. 이름:"+name);
		System.out.println("2. 성적");
		System.out.println(" 1) 정보통신개론:"+sub1 + "(" + grade1 + ")");
		System.out.println(" 2) 컴퓨터구조:"+sub2 + "(" + grade2 + ")");
		System.out.println(" 3) 자료구조:"+sub3 + "(" + grade3 + ")");
		System.out.println("3. 총점:"+total);
		System.out.println("4. 평점:"+avg);
	}
	
	public String resultGrade(int a){
		String gra = "";
		
		if (a >= 90){
			gra = "A";
		}else if(a >=80 && a <90){
			gra = "B";
		}else if(a >=70 && a <80){
			gra = "C";
		}else if(a >=60 && a <70){
			gra = "D";
		}else {
			gra = "F";
		}
		
		return gra;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Input.name = name;
	}

	public static int getSub1() {
		return sub1;
	}

	public static void setSub1(int sub1) {
		Input.sub1 = sub1;
	}

	public static int getSub2() {
		return sub2;
	}

	public static void setSub2(int sub2) {
		Input.sub2 = sub2;
	}

	public static int getSub3() {
		return sub3;
	}

	public static void setSub3(int sub3) {
		Input.sub3 = sub3;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Input.total = total;
	}

	public static int getAvg() {
		return avg;
	}

	public static void setAvg(int avg) {
		Input.avg = avg;
	}

	public static String getGrade1() {
		return grade1;
	}

	public static void setGrade1(String grade1) {
		Input.grade1 = grade1;
	}

	public static String getGrade2() {
		return grade2;
	}

	public static void setGrade2(String grade2) {
		Input.grade2 = grade2;
	}

	public static String getGrade3() {
		return grade3;
	}

	public static void setGrade3(String grade3) {
		Input.grade3 = grade3;
	}

}
