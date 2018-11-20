package tv2;

public class LTV implements tv {
	String status;
	int volume;
	
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		this.status="LTV ON";
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		this.status="LTV OFF";
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
		return "LTV [status=" + status + ", volume=" + volume + "]";
	}
}
