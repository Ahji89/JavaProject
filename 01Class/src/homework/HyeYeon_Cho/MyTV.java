package homework.HyeYeon_Cho;

public class MyTV {
	boolean powerOn;
	int channel, volume, tmp_ch, tmp_vol;
	
	/* channel�� volume�� �ּ� 0, �ִ� 100 ���̿� ���� ���� �� �ִ�.
	 * channel�� volume�� 1����, 1���Ҹ� �����մϴ�. */
	
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
				System.out.println("�ش� channel�� �������� �ʽ��ϴ�.");
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
			System.out.println("���� TV�� �����ֽ��ϴ�. ���� TV channel�� " + channel + "�Դϴ�. ���� TV volume�� " + volume + "�Դϴ�.");
		else
			System.out.println("���� TV�� �����ֽ��ϴ�.");
		
		if(channel < 0){
			print("�ּ�", "channel");
			channel = 0;
			tmp_ch = channel;
		}
		else if(100 < channel){
			print("�ִ�", "channel");
			channel = 100;
			tmp_ch = channel;
		}
		
		if(volume < 0){
			print("�ּ�", "volume");
			volume = 0;
			tmp_vol = volume;
		}
		else if(100 < volume){
			print("�ִ�", "volume");
			volume = 100;
			tmp_vol = volume;
		}
	}
	
	void print(String type){
		if(type.equals("TV")){
			if(powerOn == true)
				System.out.println(type + "�� �������ϴ�.");
			else
				System.out.println(type + "�� �������ϴ�.");
		}
		else if(type.equals("channel")){
			if(powerOn == true)
				System.out.println("TV " + type + "�� " + tmp_ch + "���� " + channel + "(��)�� ����Ǿ����ϴ�.");
			else
				System.out.println("TV�� �����־� channel ������ �Ұ����մϴ�.");
		}
		else if(type.equals("volume"))
			if(powerOn == true)
				System.out.println("TV " + type + "�� " + tmp_vol + "���� " + volume + "(��)�� ����Ǿ����ϴ�.");
			else
				System.out.println("TV�� �����־� volume ������ �Ұ����մϴ�.");
	}
	
	void print(String val, String type){
		String str;
		int num;
		
		if(val.equals("�ִ�")){
			str = "Ŀ";
			num = 100;
		}
		else{
			str = "�۾�";
			num = 0;
		}
		
		System.out.println("�Է� �� ���� " + val + "������ " + str + " ���� TV " + type + "�� " + num + "���� ����Ǿ����ϴ�.");
	}
}
