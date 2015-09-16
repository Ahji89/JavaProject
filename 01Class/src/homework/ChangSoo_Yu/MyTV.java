package homework.ChangSoo_Yu;

public class MyTV {
	boolean powerOn;
	int channel;
	int volume;

	
	
	public MyTV() {
		super();
		powerOn = false;
		channel = 0;
		volume = 0;
	}

	public boolean isPowerOn() {
		return powerOn;
	}

	public void setPowerOn(boolean powerOn) {
		this.powerOn = powerOn;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (channel > 0 && channel <= 100) {
			this.channel = channel;
		} else {
			System.out.println("only 0~100 channel");
		}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (channel > 0 && channel <= 100) {
			this.volume = volume;
		} else {
			System.out.println("only 0~100 channel");
		}
	}
	
	public void selectCh(int channel) {
		if (channel > 0 && channel <= 100) {
			this.channel = channel;
		} else {
			System.out.println("only 0~100 channel");
		}
	}
	public void incCh() {
		if (channel < 100) {
			this.channel ++;
		} else {
			System.out.println("only 0~100 channel");
		}
	}
	public void decCh() {
		if (channel > 0) {
			this.channel --;
		} else {
			System.out.println("only 0~100 channel");
		}
	}
	public void incVol() {
		if (volume < 100) {
			this.volume ++;
		} else {
			System.out.println("only 0~100 volume");
		}
	}
	public void decVol() {
		if (volume > 0) {
			this.volume --;
		} else {
			System.out.println("only 0~100 channel");
		}
	}

	@Override
	public String toString() {
		return "MyTV [powerOn=" + powerOn + ", channel=" + channel + ", volume=" + volume + "]";
	}

	/* channel과 volume은 최소 0, 최대 100 사이에 값만 가질 수 있다.
	 * channel과 volume은 1증가, 1감소만 가능합니다. */

}
