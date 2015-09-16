package homework.ChangSoo_Yu;

import homework.ChangSoo_Yu.MyTV;
import java.util.Scanner;

public class MyTV_main {

	public static void main(String[] args) {
		MyTV tv = new MyTV();
		Scanner s = new Scanner(System.in);
		int menu;
		while (true) {
			System.out.println("0 : power on/off");
			System.out.println("1 : ch up, 2 : ch down");
			System.out.println("3 : vol up, 4 : vol down");
			System.out.println("5 : select ch");
			menu = s.nextInt();
			if (menu != 0 && !(tv.isPowerOn())) {
				System.out.println("power on first!");
				continue;
			}

			switch (menu) {
			case 0:
				if (tv.isPowerOn())
					tv.setPowerOn(false);
				else
					tv.setPowerOn(true);
				break;
			case 1:
				tv.incCh();
				break;
			case 2:
				tv.decCh();
				break;
			case 3:
				tv.incVol();
				break;
			case 4:
				tv.decVol();
				break;
			case 5:
				int ch = s.nextInt();
				tv.selectCh(ch);
				break;
			default:
				break;
			}
			System.out.println("====================================================");
			System.out.println(tv);
			System.out.println("====================================================");
		}
		/* 값 출력은 TV를 On/Off, volume을 Up/Down, channel을 Up/Down의 경우로 나눠서 출력합니다.
		 * ex) TV가 꺼졌습니다. TV가 켜졌습니다.
		 * 		TV volume이 100에서 100으로 변경 되었습니다. TV volume이 0에서 0으로 변경 되었습니다. 
		 * 		TV channel이 1에서 2로 변경 되었습니다. TV channel이 89에서 88로 변경 되었습니다. */
	}

}
