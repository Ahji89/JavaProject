package homework.YongJae_Hong;

import homework.YongJae_Hong.MyTV;

public class MyTV_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTV tv = new MyTV(true,10,30);
		tv.printf();
		tv.volumeUp();
		tv.printf();
		tv.channelDown();
		tv.printf();
		tv.VolumeDown();
		tv.printf();
		tv.channelUp();
		tv.printf();
		// up down ���� �۵� ����
		MyTV tv2 = new MyTV(false,10,30);
		tv2.printf();
		// tv�� �������� ��
		MyTV tv3 = new MyTV(true,100,100);
		tv3.printf();
		tv3.volumeUp();
		tv3.channelUp();
		tv3.printf();
		// channel �� volume�� 100�� �Ѿ�� ������ ����
		
		MyTV tv4 = new MyTV(true,0,0);
		tv4.printf();
		tv4.VolumeDown();
		tv4.channelDown();
		tv4.printf();
		// channel �� volume�� 0 ������ �������� ������ ����
		/* �� ����� TV�� On/Off, volume�� Up/Down, channel�� Up/Down�� ���� ������ ����մϴ�.
		 * ex) TV�� �������ϴ�. TV�� �������ϴ�.
		 * 		TV volume�� 100���� 100���� ���� �Ǿ����ϴ�. TV volume�� 0���� 0���� ���� �Ǿ����ϴ�. 
		 * 		TV channel�� 1���� 2�� ���� �Ǿ����ϴ�. TV channel�� 89���� 88�� ���� �Ǿ����ϴ�. */
	}
}
