package homework.SeHee_Kim;

import java.util.ArrayList;
import java.util.Scanner;

public class TV {
	private boolean powerOn = false;
	protected ArrayList<TVStatus> statusList = new ArrayList<TVStatus>();
	Scanner scan = new Scanner(System.in);

	// TV�� �⺻ status channel�� volume
	TV() {
		statusList.add(new TVStatus("channel", 0, 0, 100, 1));
		statusList.add(new TVStatus("volume", 0, 0, 100, 1));
	}

	// TV ON/OFF
	public void powerOnOff() {
		powerOn = !powerOn;
		System.out.println(String.format("  TV�� %s�����ϴ�", powerOn ? "��":"��"));
	}

	// TV�� �����ִ��� üũ�Ѵ�.
	public boolean checkPower() {
		if (powerOn == false) {
			System.out.println("  TV�� �Ѿ���!!");
			return false;
		}
		return true;
	}

	// status�� ��������ŭ Up�Ǵ� Down
	public void upDown(TVStatus sc, int pm) {
		if (checkPower()) {
			StringBuffer sb = new StringBuffer();
			String str1, str2;
			pm = sc.variation * pm;
			
			str1 = String.format("[%s%s] %s : ", sc.name, pm < 0 ? "Down..] " : "Up!!]", sc.name);
			
			if ((pm > 0 && sc.value == sc.max) || (pm < 0 && sc.value == sc.min)) {
				str2 = String.format("%d -> %d (*%s %d�Դϴ�.)", sc.value, sc.value, pm < 0 ? "�ּ� " : "�ִ� ", pm < 0 ? sc.min : sc.max);
			} else {
				str2 = String.format("%d -> %d", sc.value, sc.value + pm);
				sc.value = sc.value + pm;
			}
			sb.append(str1).append(str2);
			System.out.println(sb);
		}
	}

	// status�� �Է°����� ����
	void setStatus(TVStatus sc) {
		if (checkPower()) {
			String str;
			int value = Integer.parseInt(scan.nextLine().trim());
			System.out.print(sc.name + "�Է� : ");
			
			if (value < sc.min || value > sc.max) {
				str = String.format("(*%s%d �ٽ��Է����ּ���.)", value < sc.min ? "�ּ�" : "�ִ�", value < sc.min ? sc.min : sc.max);
				System.err.println(str);
			} else {
				str = String.format("[%sChange~] %d -> %d", sc.name, sc.value, value);
				sc.value = value;
				System.out.println(str);
			}
		}
	}

	// �����޴�����
	public void displayMenu() {
		StringBuffer sb = new StringBuffer();
		System.out.println("[�����޴�]");
		System.out
				.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		System.out.println("  0:�޴�, -1:����");
		System.out
				.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.print("  1:TV�Ҵ�/����");

		for (int i = 0; i < statusList.size(); i++) {
			sb.append(", ").append(i + 2).append(":")
					.append(statusList.get(i).name).append("����");
		}
		System.out.println(sb);
		System.out
				.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

	}

	// �����޴�����
	public void selectMenu() {
		try {
			System.out.print("<�޴�����> : ");
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
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			System.out.println("");
			displayMenu();
		}
	}

	// �����޴�����
	public void displayLowMenu(int index) {
		System.out.println("");
		System.out.println("[�����޴� / " + statusList.get(index).name + "����]");
		System.out
				.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("0:�ڷΰ���, 1:up, 2:down"
				+ (index == 0 ? ", 3:������Է�" : ""));
		System.out
				.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	// �����޴�����
	public void selectLowMenu(int index) {
		boolean repeat = true;
		while (repeat) {
			try {
				System.out.print("<���ۼ���> : ");
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
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				displayLowMenu(index);
				selectLowMenu(index);
			}
		}
	}

}
