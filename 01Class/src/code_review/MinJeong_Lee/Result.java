package code_review.MinJeong_Lee;

import code_review.MinJeong_Lee.Input;

public class Result {
	
	public static void main(String[] args){
		
		Input.setName("È«±æµ¿");
		Input.setSub1(75);
		Input.setSub2(88);
		Input.setSub3(55);
		
		Input input1 = new Input();
		input1.result();
		
		Input.setName("±èÇü¼ö");
		Input.setSub1(61);
		Input.setSub2(88);
		Input.setSub3(96);
		
		Input input2 = new Input();
		input2.result();
		
		Input.setName("±è³ª¶ó");
		Input.setSub1(75);
		Input.setSub2(98);
		Input.setSub3(83);
		
		Input input3 = new Input();
		input3.result();
	}

}
