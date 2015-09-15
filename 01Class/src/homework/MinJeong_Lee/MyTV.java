package homework.MinJeong_Lee;

public class MyTV {
	boolean powerOn;
	int channel;
	int volume;
	
	/* channel�� volume�� �ּ� 0, �ִ� 100 ���̿� ���� ���� �� �ִ�.
	 * channel�� volume�� 1����, 1���Ҹ� �����մϴ�. */
	
	MyTV(){
		
	}
	
	MyTV(boolean powerOn, int channel, int volume){
		this.powerOn = powerOn;
		this.channel = absChange(channel);
		this.volume = absChange(volume);
	}
	
	/*�����ڿ��� 0~100 ���� ������ �ʱ�ȭ*/
	public int absChange(int a){
		if(a < 0){
			a = 0;
		}else if( a > 100){
			a = 100;
		}else{
			a = a;
		}
		
		return a;
	}
	
	public void volumeChange(String gubun){
		if(!this.powerOn){
			System.out.println("TV �� �����ֽ��ϴ�. TV�� �մϴ�.");
			this.powerOn = true;
		}
		int beforeVolume = this.volume;
		
		if(gubun=="UP"){
			if(this.volume < 100)
				this.volume += 1;
		}else{
			if(this.volume > 0)
				this.volume -= 1;	
		}
		
		System.out.println("TV volume�� " + beforeVolume + " ���� " + this.volume + "���� ����Ǿ����ϴ�.");
		
	}
	
	public void volumeChange(String gubun, int count){
		for(int i = 0; i < count ; i++){
			volumeChange(gubun);
		} 
	}
	
	public void channelChange(String gubun){
		if(!this.powerOn){
			System.out.println("TV �� �����ֽ��ϴ�. TV�� �մϴ�.");
			this.powerOn = true;
		}
		
		int beforeChannel = this.channel;
		if(gubun=="UP"){
			if(this.channel < 100)
				this.channel += 1;
		}else{
			if(this.channel > 0)
				this.channel -= 1;		
		}
		
		System.out.println("TV channel�� " + beforeChannel + " ���� " + this.channel + "���� ����Ǿ����ϴ�.");
	}
	
	public void channelChange(String gubun, int count){
		for(int i = 0; i < count ; i++){
			channelChange(gubun);
		} 
	}
	
	public boolean power(){
		String status = "";
		if(this.powerOn == true ){
			this.powerOn = false;
			status ="�������ϴ�.";
		}else{
			this.powerOn = true;
			status = "�������ϴ�.";
		}
		
		System.out.println("TV�� " + status);
		
		return powerOn;
	}

	public boolean isPowerOn() {
		return powerOn;
	}

	public void setPowerOn(boolean powerOn) {
		this.powerOn = powerOn;
	}

	public int getChannel() {
		return channel;
	}
	
	/*ä�ο��� 0~100 ���� ������ �ʱ�ȭ*/
	public void setChannel(int channel) {
		if(channel < 0){
			this.channel = 0;
			System.out.println("�˸� : channel�� 0���� �۾Ƽ� 0���� �ʱ�ȭ�˴ϴ�.");
		}else if( channel > 100){
			this.channel = 100;
			System.out.println("�˸� : channel�� 100���� Ŀ�� 100���� �ʱ�ȭ�˴ϴ�.");
		}else{
			this.channel = channel;
			System.out.println("�˸� : channel�� " + channel + " �ԷµǾ����ϴ�.");
		}
		
	}

	public int getVolume() {
		return volume;
	}

	/*���� 0~100 ���� ������ �ʱ�ȭ*/
	public void setVolume(int volume) {
		if(volume < 0){
			this.volume = 0;
			System.out.println("�˸� : volume�� 0���� �۾Ƽ� 0���� �ʱ�ȭ�˴ϴ�.");
		}else if( volume > 100){
			this.volume = 100;
			System.out.println("�˸� : volume�� 100���� Ŀ�� 100���� �ʱ�ȭ�˴ϴ�.");
		}else{
			this.volume = volume;
			System.out.println("�˸� : volume�� " + volume + " �ԷµǾ����ϴ�.");
		}
	}
	
	
	
}
