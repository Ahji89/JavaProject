package homework.SeHee_Kim;

public class Main {
	
	public static void main(String[] args) {
		TV tvcon = new TV();
		//TV tvcon = new MyTV();
		
		tvcon.displayMenu();
		while(true){
			tvcon.selectMenu();
		}
	}
}
