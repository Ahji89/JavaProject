package homework.SeHee_Kim;

public class TVStatus {
	String name;
	int value;
	int max;
	int min;
	int variation;

	TVStatus(String name, int status, int min, int max, int variation) {
		this.name = name;
		if (status >= min && status <= max) {
			this.value = status;
		} else {
			this.value = status < min ? min : max;
		}
		this.max = max;
		this.min = min;
		this.variation = variation;
	}
}
