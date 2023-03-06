package deadlock1;

public class Data {
     
	private int x=4;
	
	public int getX() {
		return x;
	}
	synchronized public void consume(int arg) {
		String th_name=Thread.currentThread().getName();
		System.out.println(th_name+"running");
		if(x<5) {
			System.out.println("insufficient data waiting for notification");
			try {
				wait();
				}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(th_name+" resuming back");
			x=x-arg;
			System.out.println(x);
		}
		else {
			System.out.println("data sufficient");
			x=x-arg;
		}
	}
	synchronized public void produce(int arg) {
		String th_name=Thread.currentThread().getName();
		System.out.println("data sufficient ");
		x=x+arg;
		System.out.println(th_name+" notifying all");
		notifyAll();
	}
}
