package homework.TaeWan_Kwon;

import homework.TaeWan_Kwon.MyTV;

public class MyTV_main {

	public static void main(String[] args) {
		MyTV tv = new MyTV();
		tv.tvOn();
		tv.setChannel(0);
		
	
	    tv.channelDown();
	    
	    tv.channelUp();
	 
	    
	
	    tv.voulmeDown();
	    tv.voulmeDown();
	    tv.volumeUp();
	    
	    tv.tvOff();
	   
		
		
		/* 값 출력은 TV를 On/Off, volume을 Up/Down, channel을 Up/Down의 경우로 나눠서 출력합니다.
		 * ex) TV가 꺼졌습니다. TV가 켜졌습니다.
		 * 		TV volume이 100에서 100으로 변경 되었습니다. TV volume이 0에서 0으로 변경 되었습니다. 
		 * 		TV channel이 1에서 2로 변경 되었습니다. TV channel이 89에서 88로 변경 되었습니다. */
	}

}
