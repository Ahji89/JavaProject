package homework.MinJeong_Lee;

import homework.MinJeong_Lee.MyTV;

public class MyTV_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* �� ����� TV�� On/Off, volume�� Up/Down, channel�� Up/Down�� ���� ������ ����մϴ�.
		 * ex) TV�� �������ϴ�. TV�� �������ϴ�.
		 * 		TV volume�� 100���� 100���� ���� �Ǿ����ϴ�. TV volume�� 0���� 0���� ���� �Ǿ����ϴ�. 
		 * 		TV channel�� 1���� 2�� ���� �Ǿ����ϴ�. TV channel�� 89���� 88�� ���� �Ǿ����ϴ�. */
		System.out.println("###############################");
		System.out.println("ù��° TV ���� ����");
		
		MyTV firstTv = new MyTV();		
		firstTv.power();		
		firstTv.volumeChange("UP");
		firstTv.volumeChange("UP");
		firstTv.channelChange("DOWN");		
		firstTv.volumeChange("UP");
		firstTv.channelChange("UP");
		firstTv.volumeChange("DOWN");	
		firstTv.power();
		
		System.out.println("ù��° TV ���� ����");
		System.out.println("###############################");
		System.out.println("�ι�° TV ���� ����");
			
		MyTV secondTv = new MyTV(true, 55, 70);		
		secondTv.power();
		secondTv.power();
		secondTv.volumeChange("UP");
		secondTv.channelChange("DOWN");
		secondTv.channelChange("DOWN");
		secondTv.setVolume(-30);		
		secondTv.volumeChange("DOWN");
		secondTv.volumeChange("DOWN");
		secondTv.setChannel(150);
		secondTv.channelChange("UP");
		System.out.println("�ι�° TV ���� ����");
		System.out.println("###############################");
		System.out.println("����° TV ���� ����");
		
		MyTV thridTv = new MyTV(false, 5, -3);		
		thridTv.channelChange("DOWN", 10);
		thridTv.volumeChange("UP", 3);
		thridTv.volumeChange("DOWN", 2);
		
		System.out.println("����° TV ���� ����");
		
	}

}
