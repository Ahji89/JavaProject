package homework.TaeWan_Kwon;

public class MyTV {
	boolean powerOn;
	int channel;
	int volume;
	int chCnt,voCnt;

	public void tvOn(){
		System.out.println("TV�� �������ϴ�.");
		powerOn = true;
	}
	public void tvOff(){
		System.out.println("TV�� �������ϴ�.");
		powerOn = false;
	}
	
	public void setChannel(int channel) {
		int temp = this.channel;
		if(powerOn == true){
		if(channel>=0 && channel<=100){
			this.channel = channel;
		System.out.println("TV channel�� "+temp+"���� "+getChannel()+"���� ���� �Ǿ����ϴ�.");
		 }else{
			 System.out.println("ä���� 0~100 ���̷� ������ �ּ���");
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
		System.out.println("TV channel�� "+temp+"���� "+getChannel()+"���� ���� �Ǿ����ϴ�.");
		 }else{
			 System.out.println("ä���� 0~100 ���̷� ������ �ּ���");
		 }
		}
	}
	public void channelDown(){
		int temp = this.channel;
		if(powerOn == true){
		if(channel>0 && channel<=100){
		--this.channel;
		System.out.println("TV channel�� "+temp+"���� "+getChannel()+"���� ���� �Ǿ����ϴ�.");
		 }else{
			 System.out.println("ä���� 0~100 ���̷� ������ �ּ���");
		 }
		}
	}
	public void volumeUp(){
		int temp = this.volume;
		if(powerOn == true){
		if(volume>=0 && volume<100){
		++this.volume;
		System.out.println("TV volume�� "+temp+"���� "+getVolume()+"���� ���� �Ǿ����ϴ�.");
		 }else{
			 System.out.println("������ 0~100 ���̷� ������ �ּ���");
		 }
		}
	}
	public void voulmeDown(){
		int temp = this.volume;
		if(powerOn == true){
		if(volume>0 && volume<=100){
		--this.volume;
		System.out.println("TV volume�� "+temp+"���� "+getVolume()+"���� ���� �Ǿ����ϴ�.");
		 }else{
			 System.out.println("������ 0~100 ���̷� ������ �ּ���");
		 }
		}
	}

	/* channel�� volume�� �ּ� 0, �ִ� 100 ���̿� ���� ���� �� �ִ�.
	 * channel�� volume�� 1����, 1���Ҹ� �����մϴ�. */
}
