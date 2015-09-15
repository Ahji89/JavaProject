package homework.YongJae_Hong;

import homework.YongJae_Hong.MyTV;

public class MyTV_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTV tv = new MyTV(true,10,30);
		tv.printf();
		tv.volumeUp();
		tv.printf();
		tv.channelDown();
		tv.printf();
		tv.VolumeDown();
		tv.printf();
		tv.channelUp();
		tv.printf();
		// up down 정상 작동 예제
		MyTV tv2 = new MyTV(false,10,30);
		tv2.printf();
		// tv가 꺼져있을 때
		MyTV tv3 = new MyTV(true,100,100);
		tv3.printf();
		tv3.volumeUp();
		tv3.channelUp();
		tv3.printf();
		// channel 과 volume이 100을 넘어가지 않음을 보임
		
		MyTV tv4 = new MyTV(true,0,0);
		tv4.printf();
		tv4.VolumeDown();
		tv4.channelDown();
		tv4.printf();
		// channel 과 volume가 0 밑으로 내려가지 않음을 보임
		/* 값 출력은 TV를 On/Off, volume을 Up/Down, channel을 Up/Down의 경우로 나눠서 출력합니다.
		 * ex) TV가 꺼졌습니다. TV가 켜졌습니다.
		 * 		TV volume이 100에서 100으로 변경 되었습니다. TV volume이 0에서 0으로 변경 되었습니다. 
		 * 		TV channel이 1에서 2로 변경 되었습니다. TV channel이 89에서 88로 변경 되었습니다. */
	}
}
