package homework.HyeYeon_Cho;

import homework.HyeYeon_Cho.MyTV;

public class MyTV_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 값 출력은 TV를 On/Off, volume을 Up/Down, channel을 Up/Down의 경우로 나눠서 출력합니다.
		 * ex) TV가 꺼졌습니다. TV가 켜졌습니다.
		 * 		TV volume이 100에서 100으로 변경 되었습니다. TV volume이 0에서 0으로 변경 되었습니다. 
		 * 		TV channel이 1에서 2로 변경 되었습니다. TV channel이 89에서 88로 변경 되었습니다. */
		
		MyTV myTV = new MyTV(true, 35, 12);
		
		myTV.channelUp();
		myTV.volumeDown();
		myTV.channelChange(100);
		myTV.channelDown();
		myTV.volumeUp();
		myTV.turnOnOff();
		
		System.out.println();
		
		MyTV yourTV = new MyTV(false, 5, 20);
		
		yourTV.channelDown();
		yourTV.volumeUp();
		yourTV.channelChange(0);
		yourTV.channelUp();
		yourTV.volumeDown();
		yourTV.turnOnOff();
		
		System.out.println();
		
		MyTV herTV = new MyTV(true, 105, 135);
		herTV.channelDown();
		herTV.volumeDown();
		herTV.channelChange(100);
		herTV.channelUp();
		herTV.volumeUp();
	}

}
