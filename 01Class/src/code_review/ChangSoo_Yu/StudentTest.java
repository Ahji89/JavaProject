package code_review.ChangSoo_Yu;

import code_review.ChangSoo_Yu.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student st1 = new Student("ȫ�浿");
		Student st2 = new Student("������");
		Student st3 = new Student("�質��");
		
		int[] score1 = {10, 15, 20};
		int[] score2 = {70, 85, 60};
		int[] score3 = {100, 85, 90};
		st1.setScore(score1);
		st2.setScore(score2);
		st3.setScore(score3);
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		

	}

}
