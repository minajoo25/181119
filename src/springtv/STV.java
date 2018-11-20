package springtv;

public class STV implements TV {
	String status;
	int volume;
	public STV(){
		System.out.println("Constructor STV ...");
	}
	public void startTV() {
		System.out.println("Start stv...");
	}
	public void endTV() {
		System.out.println("End stv...");
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		this.status="STV ON";
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		this.status="STV OFF";
	}

	@Override
	public void volumeUp(int v) {
		// TODO Auto-generated method stub
		this.volume+=v;
	}

	@Override
	public void volumeDown(int v) {
		// TODO Auto-generated method stub
		this.volume-=v;
	}

	@Override
	public String toString() {
		return "STV [status=" + status + ", volume=" + volume + "]";
	}

}
