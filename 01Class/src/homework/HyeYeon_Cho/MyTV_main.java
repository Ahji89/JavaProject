package homework.HyeYeon_Cho;

import homework.HyeYeon_Cho.MyTV;

public class MyTV_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* �� ����� TV�� On/Off, volume�� Up/Down, channel�� Up/Down�� ���� ������ ����մϴ�.
		 * ex) TV�� �������ϴ�. TV�� �������ϴ�.
		 * 		TV volume�� 100���� 100���� ���� �Ǿ����ϴ�. TV volume�� 0���� 0���� ���� �Ǿ����ϴ�. 
		 * 		TV channel�� 1���� 2�� ���� �Ǿ����ϴ�. TV channel�� 89���� 88�� ���� �Ǿ����ϴ�. */
		
		MyTV myTV = new MyTV(true, 35, 12);
		
		myTV.channelUp();
		myTV.volumeDown();
		myTV.channelChange(100);
		myTV.channelDown();
		myTV.volumeUp();
		myTV.turnOnOff();
		
		System.out.println();
		
		MyTV yourTV = new MyTV(false, 5, 20);
		
		yourTV.channelDown();
		yourTV.volumeUp();
		yourTV.channelChange(0);
		yourTV.channelUp();
		yourTV.volumeDown();
		yourTV.turnOnOff();
		
		System.out.println();
		
		MyTV herTV = new MyTV(true, 105, 135);
		herTV.channelDown();
		herTV.volumeDown();
		herTV.channelChange(100);
		herTV.channelUp();
		herTV.volumeUp();
	}

}
