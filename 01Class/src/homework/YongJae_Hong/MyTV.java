package homework.YongJae_Hong;

public class MyTV {
	boolean powerOn;
	int channel;
	int volume;
	MyTV(Boolean Po, int ch, int vol){
		powerOn = Po;
		if(powerOn == true){
			if(ch < 0)
				channel=0;
			else if(ch > 100)
				channel=100;
			if(vol < 0)
				volume=0;
			else if(vol > 100)
				volume=100;
			}
		else{
			powerOn = Po;
		}

		channel = ch;
		volume = vol;
	}
	/* channel과 volume은 최소 0, 최대 100 사이에 값만 가질 수 있다.
	 * channel과 volume은 1증가, 1감소만 가능합니다. */
	void channelUp(){
		if(channel<100)
			channel++;
		else
			channel=100;
	}
	void channelDown(){
		if(channel>0)
			channel--;
		else
			channel=0;
	}
	void volumeUp(){
		if(volume<100)
			volume++;
		else
			volume=100;
	}
	void VolumeDown(){
		if(volume>0)
			volume--;
		else
			volume=0;
	}
	void printf(){
		if(powerOn == true){
			System.out.print("현재 TV는 On상태입니다.");
			System.out.print("현재 TV channel = " + channel + "입니다.");
			System.out.println("현재 TV Volume = " + volume + " 입니다.");
		}
		else
		{
			System.out.println("현재 TV가 꺼져있습니다. 채널과 볼륨은 알 수 없습니다.");
		}
	
	}
}