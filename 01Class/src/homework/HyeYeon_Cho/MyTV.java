package homework.HyeYeon_Cho;

public class MyTV {
	boolean powerOn;
	int channel, volume, tmp_ch, tmp_vol;
	
	/* channel과 volume은 최소 0, 최대 100 사이에 값만 가질 수 있다.
	 * channel과 volume은 1증가, 1감소만 가능합니다. */
	
	MyTV(boolean powerOn, int channel, int volume){
		this.powerOn = powerOn;
		this.channel = channel;
		this.volume = volume;
		this.tmp_ch = channel;
		this.tmp_vol = volume;
		print();
	}
	
	boolean turnOnOff(){
		if(powerOn == true)
			powerOn = false;
		else
			powerOn = true;
		
		print("TV");
		
		return powerOn;
	}
	
	int channelUp(){
		if(powerOn == true){
			if(0 < channel && channel < 100)
				channel += 1;
		}
		
		print("channel");
		
		tmp_ch = channel;
		
		return channel;
	}
	
	int channelDown(){
		if(powerOn == true){
			if(0 < channel)
				channel -= 1;
		}
		
		print("channel");
		
		tmp_ch = channel;
		
		return channel;
	}
	
	int channelChange(int channel){
		if(powerOn == true){
			if(0 <= channel && channel >= 100){
				this.channel = channel;
				print("channel");
			}
			else
				System.out.println("해당 channel은 존재하지 않습니다.");
		}
		else
			print("channel");
		
		tmp_ch = channel;
		
		return channel;
	}
	
	int volumeUp(){
		if(powerOn == true){
			if(0 < volume && volume < 100)
				volume += 1;
		}
		
		print("volume");
		
		tmp_vol = volume;
		
		return volume;
	}
	
	int volumeDown(){
		if(powerOn == true){
			if(0 < volume)
				volume -= 1;
		}
		
		print("volume");
		
		tmp_vol = volume;
		
		return volume;
	}
	
	void print(){
		if(powerOn == true)
			System.out.println("현재 TV는 켜져있습니다. 현재 TV channel은 " + channel + "입니다. 현재 TV volume은 " + volume + "입니다.");
		else
			System.out.println("현재 TV는 꺼져있습니다.");
		
		if(channel < 0){
			print("최소", "channel");
			channel = 0;
			tmp_ch = channel;
		}
		else if(100 < channel){
			print("최대", "channel");
			channel = 100;
			tmp_ch = channel;
		}
		
		if(volume < 0){
			print("최소", "volume");
			volume = 0;
			tmp_vol = volume;
		}
		else if(100 < volume){
			print("최대", "volume");
			volume = 100;
			tmp_vol = volume;
		}
	}
	
	void print(String type){
		if(type.equals("TV")){
			if(powerOn == true)
				System.out.println(type + "가 켜졌습니다.");
			else
				System.out.println(type + "가 꺼졌습니다.");
		}
		else if(type.equals("channel")){
			if(powerOn == true)
				System.out.println("TV " + type + "이 " + tmp_ch + "에서 " + channel + "(으)로 변경되었습니다.");
			else
				System.out.println("TV가 꺼져있어 channel 변경이 불가능합니다.");
		}
		else if(type.equals("volume"))
			if(powerOn == true)
				System.out.println("TV " + type + "이 " + tmp_vol + "에서 " + volume + "(으)로 변경되었습니다.");
			else
				System.out.println("TV가 꺼져있어 volume 변경이 불가능합니다.");
	}
	
	void print(String val, String type){
		String str;
		int num;
		
		if(val.equals("최대")){
			str = "커";
			num = 100;
		}
		else{
			str = "작아";
			num = 0;
		}
		
		System.out.println("입력 된 값이 " + val + "값보다 " + str + " 현재 TV " + type + "이 " + num + "으로 변경되었습니다.");
	}
}
