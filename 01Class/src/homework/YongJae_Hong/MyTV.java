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
	/* channel�� volume�� �ּ� 0, �ִ� 100 ���̿� ���� ���� �� �ִ�.
	 * channel�� volume�� 1����, 1���Ҹ� �����մϴ�. */
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
			System.out.print("���� TV�� On�����Դϴ�.");
			System.out.print("���� TV channel = " + channel + "�Դϴ�.");
			System.out.println("���� TV Volume = " + volume + " �Դϴ�.");
		}
		else
		{
			System.out.println("���� TV�� �����ֽ��ϴ�. ä�ΰ� ������ �� �� �����ϴ�.");
		}
	
	}
}