package code_review.ChangSoo_Yu;

import java.util.Arrays;

public class Student {
	String name;
	String grade;
	
	int[] score = new int[3];
	
	public Student(){}
	public Student(String name){
		setName(name);
	}
	public Student(String name, int[] score){
		setName(name);
		setScore(score);
	}
	
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getScore() {
		return score;
	}
	public void setScore(int[] score) {
		this.score = score;
	}
	public int sum() {
		int sum = 0;
		for (int temp : score) {
			sum += temp;
		}
		return sum;
	}
	public double avg() {
		int sum = 0;
		for (int temp : score) {
			sum += temp;
		}
		return sum / score.length;
	}
	public char calcGrade() {
		int iavg = (int) avg();
		
		if (iavg > 90) return 'A';
		else if (iavg > 80) return 'B';
		else if (iavg > 70) return 'C';
		else if (iavg > 60) return 'D';
		else return 'F';
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", score=");
		builder.append(Arrays.toString(score));
		builder.append(", sum=");
		builder.append(sum() + "");
		builder.append(", avg=");
		builder.append(avg() + "");
		builder.append(", grade=");
		builder.append(calcGrade() + "");
		builder.append("]");
		return builder.toString();
	}
	
}
