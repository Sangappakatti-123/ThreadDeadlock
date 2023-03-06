package deadlock1;

public class ConsumerThread extends Thread {
    
	private Data d1;

	public ConsumerThread(Data d1) {
		super();
		this.d1 = d1;
	}
	public void run() {
		d1.consume(8);
	}
}
