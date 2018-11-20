package tv2;

public class STV implements tv {
	String status;
	int volume;
	int size;
	String color;
	public STV(){
		System.out.println("Constructor STV ...");
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
		return "STV [status=" + status + ", volume=" + volume + ", size=" + size + ", color=" + color + "]";
	}

	

}
