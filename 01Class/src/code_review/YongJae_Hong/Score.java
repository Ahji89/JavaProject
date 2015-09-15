package code_review.YongJae_Hong;

public class Score {
	public static class Student{
		String name;
		int score1;
		int score2;
		int score3;
		char grade1;
		char grade2;
		char grade3;
		int sum;
		double avg;
		char grade(int score)
		{
			if(score <=100 && score >90)
				return 'A';
			else if(score <=90 && score > 80)
				return 'B';
			else if(score <=80 && score > 70)
				return 'C';
			else if(score <=70 && score > 60)
				return 'D';
			else
				return 'F';
		}
		int sum(int score1, int score2, int score3)
		{
			return (score1 + score2 + score3);
		}
		double avg(int sum)
		{
			return (double)sum/3;
		}
		void print(){
			System.out.println(name);
			System.out.println(score1);
			System.out.println(grade1);
			System.out.println(score2);
			System.out.println(grade2);
			System.out.println(score3);
			System.out.println(grade3);
			System.out.println(sum);
			System.out.println(avg);
		}
	}
	public static void main(String[] args)
	{
		Student student1 = new Student();
		student1.name = "È«±æµ¿";
		student1.score1 = 90;
		student1.grade1 = student1.grade(student1.score1);
		student1.score2 = 81;
		student1.grade2 = student1.grade(student1.score2);		
		student1.score3 = 70;
		student1.grade3 = student1.grade(student1.score3);		
		student1.sum = student1.sum(student1.score1,student1.score2,student1.score3);
		student1.avg = student1.avg(student1.sum);
		student1.print();
		
		Student student2 = new Student();
		student2.name = "±èÇü¼ö";
		student2.score1 = 65;
		student2.grade1 = student2.grade(student2.score1);
		student2.score2 = 35;
		student2.grade2 = student2.grade(student2.score2);		
		student2.score3 = 75;
		student2.grade3 = student2.grade(student2.score3);		
		student2.sum = student2.sum(student2.score1,student2.score2,student2.score3);
		student2.avg = student2.avg(student2.sum);
		student2.print();
		
		
		Student student3 = new Student();
		student3.name = "±è³ª¶ó";
		student3.score1 = 97;
		student3.grade1 = student3.grade(student3.score1);
		student3.score2 = 84;
		student3.grade2 = student3.grade(student3.score2);		
		student3.score3 = 34;
		student3.grade3 = student3.grade(student3.score3);		
		student3.sum = student3.sum(student3.score1,student3.score2,student3.score3);
		student3.avg = student3.avg(student3.sum);
		student3.print();
	}
}
