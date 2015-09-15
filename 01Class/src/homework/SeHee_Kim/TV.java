package homework.SeHee_Kim;

import java.util.ArrayList;
import java.util.Scanner;

public class TV {
	private boolean powerOn = false;
	protected ArrayList<TVStatus> statusList = new ArrayList<TVStatus>();
	Scanner scan = new Scanner(System.in);

	// TV의 기본 status channel과 volume
	TV() {
		statusList.add(new TVStatus("channel", 0, 0, 100, 1));
		statusList.add(new TVStatus("volume", 0, 0, 100, 1));
	}

	// TV ON/OFF
	public void powerOnOff() {
		powerOn = !powerOn;
		System.out.println(String.format("  TV가 %s졌습니다", powerOn ? "켜":"꺼"));
	}

	// TV가 켜져있는지 체크한다.
	public boolean checkPower() {
		if (powerOn == false) {
			System.out.println("  TV를 켜야지!!");
			return false;
		}
		return true;
	}

	// status를 증감값만큼 Up또는 Down
	public void upDown(TVStatus sc, int pm) {
		if (checkPower()) {
			StringBuffer sb = new StringBuffer();
			String str1, str2;
			pm = sc.variation * pm;
			
			str1 = String.format("[%s%s] %s : ", sc.name, pm < 0 ? "Down..] " : "Up!!]", sc.name);
			
			if ((pm > 0 && sc.value == sc.max) || (pm < 0 && sc.value == sc.min)) {
				str2 = String.format("%d -> %d (*%s %d입니다.)", sc.value, sc.value, pm < 0 ? "최소 " : "최대 ", pm < 0 ? sc.min : sc.max);
			} else {
				str2 = String.format("%d -> %d", sc.value, sc.value + pm);
				sc.value = sc.value + pm;
			}
			sb.append(str1).append(str2);
			System.out.println(sb);
		}
	}

	// status를 입력값으로 변경
	void setStatus(TVStatus sc) {
		if (checkPower()) {
			String str;
			int value = Integer.parseInt(scan.nextLine().trim());
			System.out.print(sc.name + "입력 : ");
			
			if (value < sc.min || value > sc.max) {
				str = String.format("(*%s%d 다시입력해주세요.)", value < sc.min ? "최소" : "최대", value < sc.min ? sc.min : sc.max);
				System.err.println(str);
			} else {
				str = String.format("[%sChange~] %d -> %d", sc.name, sc.value, value);
				sc.value = value;
				System.out.println(str);
			}
		}
	}

	// 상위메뉴노출
	public void displayMenu() {
		StringBuffer sb = new StringBuffer();
		System.out.println("[상위메뉴]");
		System.out
				.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("  0:메뉴, -1:종료");
		System.out
				.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.print("  1:TV켠다/끈다");

		for (int i = 0; i < statusList.size(); i++) {
			sb.append(", ").append(i + 2).append(":")
					.append(statusList.get(i).name).append("조작");
		}
		System.out.println(sb);
		System.out
				.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

	}

	// 상위메뉴선택
	public void selectMenu() {
		try {
			System.out.print("<메뉴선택> : ");
			int selected = Integer.parseInt(scan.nextLine().trim());
			if (selected == 0) {
				displayMenu();
			} else if (selected == -1) {
				System.exit(0);
			} else if (selected == 1) {
				powerOnOff();
			} else if (selected > -1 && selected <= statusList.size() + 2) {
				if (checkPower()) {
					displayLowMenu(selected - 2);
					selectLowMenu(selected - 2);
				}
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("잘못입력하셨습니다.");
			System.out.println("");
			displayMenu();
		}
	}

	// 하위메뉴노출
	public void displayLowMenu(int index) {
		System.out.println("");
		System.out.println("[하위메뉴 / " + statusList.get(index).name + "조작]");
		System.out
				.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("0:뒤로가기, 1:up, 2:down"
				+ (index == 0 ? ", 3:사용자입력" : ""));
		System.out
				.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	// 하위메뉴선택
	public void selectLowMenu(int index) {
		boolean repeat = true;
		while (repeat) {
			try {
				System.out.print("<동작선택> : ");
				int selected = Integer.parseInt(scan.nextLine().trim());
				if (selected == 0) {
					repeat = false;
					displayMenu();
					selectMenu();
				} else if (selected == 1) {
					upDown(statusList.get(index), 1);
				} else if (selected == 2) {
					upDown(statusList.get(index), -1);
				} else if (selected == 3 && index == 0) {
					setStatus(statusList.get(index));
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("잘못입력하셨습니다.");
				displayLowMenu(index);
				selectLowMenu(index);
			}
		}
	}

}
