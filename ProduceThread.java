package deadlock1;

public class ProduceThread extends Thread{
       private Data d1;

	public ProduceThread(Data d1) {
		super();
		this.d1 = d1;
	}
       public void run() {
    	   d1.produce(20);
       }
}
