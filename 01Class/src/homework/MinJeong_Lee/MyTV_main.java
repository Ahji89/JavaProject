package homework.MinJeong_Lee;

import homework.MinJeong_Lee.MyTV;

public class MyTV_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 값 출력은 TV를 On/Off, volume을 Up/Down, channel을 Up/Down의 경우로 나눠서 출력합니다.
		 * ex) TV가 꺼졌습니다. TV가 켜졌습니다.
		 * 		TV volume이 100에서 100으로 변경 되었습니다. TV volume이 0에서 0으로 변경 되었습니다. 
		 * 		TV channel이 1에서 2로 변경 되었습니다. TV channel이 89에서 88로 변경 되었습니다. */
		System.out.println("###############################");
		System.out.println("첫번째 TV 조작 시작");
		
		MyTV firstTv = new MyTV();		
		firstTv.power();		
		firstTv.volumeChange("UP");
		firstTv.volumeChange("UP");
		firstTv.channelChange("DOWN");		
		firstTv.volumeChange("UP");
		firstTv.channelChange("UP");
		firstTv.volumeChange("DOWN");	
		firstTv.power();
		
		System.out.println("첫번째 TV 조작 종료");
		System.out.println("###############################");
		System.out.println("두번째 TV 조작 시작");
			
		MyTV secondTv = new MyTV(true, 55, 70);		
		secondTv.power();
		secondTv.power();
		secondTv.volumeChange("UP");
		secondTv.channelChange("DOWN");
		secondTv.channelChange("DOWN");
		secondTv.setVolume(-30);		
		secondTv.volumeChange("DOWN");
		secondTv.volumeChange("DOWN");
		secondTv.setChannel(150);
		secondTv.channelChange("UP");
		System.out.println("두번째 TV 조작 종료");
		System.out.println("###############################");
		System.out.println("세번째 TV 조작 시작");
		
		MyTV thridTv = new MyTV(false, 5, -3);		
		thridTv.channelChange("DOWN", 10);
		thridTv.volumeChange("UP", 3);
		thridTv.volumeChange("DOWN", 2);
		
		System.out.println("세번째 TV 조작 종료");
		
	}

}
