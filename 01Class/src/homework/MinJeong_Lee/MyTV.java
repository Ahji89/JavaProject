package homework.MinJeong_Lee;

public class MyTV {
	boolean powerOn;
	int channel;
	int volume;
	
	/* channel과 volume은 최소 0, 최대 100 사이에 값만 가질 수 있다.
	 * channel과 volume은 1증가, 1감소만 가능합니다. */
	
	MyTV(){
		
	}
	
	MyTV(boolean powerOn, int channel, int volume){
		this.powerOn = powerOn;
		this.channel = absChange(channel);
		this.volume = absChange(volume);
	}
	
	/*생성자에서 0~100 사이 값으로 초기화*/
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
			System.out.println("TV 가 꺼져있습니다. TV를 켭니다.");
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
		
		System.out.println("TV volume이 " + beforeVolume + " 에서 " + this.volume + "으로 변경되었습니다.");
		
	}
	
	public void volumeChange(String gubun, int count){
		for(int i = 0; i < count ; i++){
			volumeChange(gubun);
		} 
	}
	
	public void channelChange(String gubun){
		if(!this.powerOn){
			System.out.println("TV 가 꺼져있습니다. TV를 켭니다.");
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
		
		System.out.println("TV channel이 " + beforeChannel + " 에서 " + this.channel + "으로 변경되었습니다.");
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
			status ="꺼졌습니다.";
		}else{
			this.powerOn = true;
			status = "켜졌습니다.";
		}
		
		System.out.println("TV가 " + status);
		
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
	
	/*채널에서 0~100 사이 값으로 초기화*/
	public void setChannel(int channel) {
		if(channel < 0){
			this.channel = 0;
			System.out.println("알림 : channel이 0보다 작아서 0으로 초기화됩니다.");
		}else if( channel > 100){
			this.channel = 100;
			System.out.println("알림 : channel이 100보다 커서 100으로 초기화됩니다.");
		}else{
			this.channel = channel;
			System.out.println("알림 : channel이 " + channel + " 입력되었습니다.");
		}
		
	}

	public int getVolume() {
		return volume;
	}

	/*볼륨 0~100 사이 값으로 초기화*/
	public void setVolume(int volume) {
		if(volume < 0){
			this.volume = 0;
			System.out.println("알림 : volume이 0보다 작아서 0으로 초기화됩니다.");
		}else if( volume > 100){
			this.volume = 100;
			System.out.println("알림 : volume이 100보다 커서 100으로 초기화됩니다.");
		}else{
			this.volume = volume;
			System.out.println("알림 : volume이 " + volume + " 입력되었습니다.");
		}
	}
	
	
	
}
