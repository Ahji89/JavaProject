package code_review.TaeWan_Kwon;

public class Person {
	String name;
	String[] sub = {"정보통신개론","컴퓨터구조","자료구조"};
	int[] score=new int[3];
	
	Person(String name){
		this.name = name;
	}
	
	int avg(){
		int sum = 0;
		for(int i=0;i<score.length;i++){
			sum+=score[i];
		}
		return sum/3;
	}
	int sum(){
		int sum = 0;
		for(int i=0;i<score.length;i++){
			sum+=score[i];
		}
		return sum;
	}
	
	String credit(int socre){
		String creditSave;
		int score = socre;
		if(score>=91 && score<=100){
			creditSave = "A";
		}else if(score>=81 && score<=90){
			creditSave = "B";
		}else if(score>=71 && score<=80){
			creditSave = "C";
	    }else if(score>=61 && score<=70){
	    	creditSave = "D";
	    }else{
	    	creditSave = "F";
	    }
		
		return creditSave;
	
	}
	
	void print(Person person){
		System.out.println("학생 : "+person.name);
	    for(int i = 0 ; i<person.sub.length;i++){
	    	System.out.println("과목 :"+person.sub[i]+" 점수 : "+person.score[i]+" 학점 : "+person.credit(person.score[i]));
	    }
	    System.out.println("총점 : "+person.sum()+" 평균 : "+person.avg());
	}

	public static void main(String[] args) {
		Person person1 = new Person("홍길동");
	    person1.score[0] =80; person1.score[1] =90; person1.score[2] =75;
        person1.print(person1);
	    System.out.println("------------------------------------------------------");
		Person person2 = new Person("김형수");
	    person2.score[0] =91; person2.score[1] =76; person2.score[2] =66;
	    person2.print(person2);
	    System.out.println("------------------------------------------------------");
		Person person3 = new Person("김나라");
	    person3.score[0] =34; person3.score[1] =99; person3.score[2] =75;
	    person3.print(person3);

	}

}
