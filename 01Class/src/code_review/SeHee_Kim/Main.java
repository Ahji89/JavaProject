package code_review.SeHee_Kim;

import code_review.SeHee_Kim.Grade;

public class Main {
	public static void main(String[] args) {
		Grade[] students = {
				new Grade("�輼��", 90, 81, 55),
				new Grade("������", 80, 95, 75),
				new Grade("�̹���", 100, 88, 35),
		};
		
		for(int i=0; i<students.length; i++){
			students[i].printScore();
			students[i].printGrade();
			students[i].printTotal();
			students[i].printAverage();
			System.out.println("--------------------");
		}
	}
}
