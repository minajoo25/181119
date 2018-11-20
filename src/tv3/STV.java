package tv3;

public class STV implements TV {
	String status;
	int volume;
	
	
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
