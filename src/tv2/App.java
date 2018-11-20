package tv2;

public class App {
	public static void main(String args[]) {
		tv stv = new STV();
		tv ltv = new LTV();
		stv.turnOn();
		stv.volumeUp(10);
		System.out.println(stv);
	}
}
