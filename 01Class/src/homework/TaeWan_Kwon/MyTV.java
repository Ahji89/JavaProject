package homework.TaeWan_Kwon;

public class MyTV {
	boolean powerOn;
	int channel;
	int volume;
	int chCnt,voCnt;

	public void tvOn(){
		System.out.println("TV가 켜졌습니다.");
		powerOn = true;
	}
	public void tvOff(){
		System.out.println("TV가 꺼졌습니다.");
		powerOn = false;
	}
	
	public void setChannel(int channel) {
		int temp = this.channel;
		if(powerOn == true){
		if(channel>=0 && channel<=100){
			this.channel = channel;
		System.out.println("TV channel이 "+temp+"에서 "+getChannel()+"으로 변경 되었습니다.");
		 }else{
			 System.out.println("채널을 0~100 사이로 조정해 주세요");
		 }
		}
	}
	public int getChannel() {
		return channel;
	}	
	public int getVolume() {
		return volume;
	}
	public void channelUp(){
		int temp = this.channel;
		if(powerOn == true){
		if(channel>=0 && channel<100){
			++this.channel;
		System.out.println("TV channel이 "+temp+"에서 "+getChannel()+"으로 변경 되었습니다.");
		 }else{
			 System.out.println("채널을 0~100 사이로 조정해 주세요");
		 }
		}
	}
	public void channelDown(){
		int temp = this.channel;
		if(powerOn == true){
		if(channel>0 && channel<=100){
		--this.channel;
		System.out.println("TV channel이 "+temp+"에서 "+getChannel()+"으로 변경 되었습니다.");
		 }else{
			 System.out.println("채널을 0~100 사이로 조정해 주세요");
		 }
		}
	}
	public void volumeUp(){
		int temp = this.volume;
		if(powerOn == true){
		if(volume>=0 && volume<100){
		++this.volume;
		System.out.println("TV volume이 "+temp+"에서 "+getVolume()+"으로 변경 되었습니다.");
		 }else{
			 System.out.println("볼륨을 0~100 사이로 조정해 주세요");
		 }
		}
	}
	public void voulmeDown(){
		int temp = this.volume;
		if(powerOn == true){
		if(volume>0 && volume<=100){
		--this.volume;
		System.out.println("TV volume이 "+temp+"에서 "+getVolume()+"으로 변경 되었습니다.");
		 }else{
			 System.out.println("볼륨을 0~100 사이로 조정해 주세요");
		 }
		}
	}

	/* channel과 volume은 최소 0, 최대 100 사이에 값만 가질 수 있다.
	 * channel과 volume은 1증가, 1감소만 가능합니다. */
}
