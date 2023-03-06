package deadlock1;

public class Mainclass {
public static void main(String[] args) {
	Data d1=new Data();
	ConsumerThread c1=new ConsumerThread(d1);
	ConsumerThread c2=new ConsumerThread(d1);
	ConsumerThread c3=new ConsumerThread(d1);
	ProduceThread  p1=new ProduceThread(d1);
	
	c1.setName("c1 thread ");
	c2.setName("c2 thread");
	c3.setName("c3 thread");
	p1.setName("p1 thread");
	
	c1.start();
	c2.start();
	c3.start();
	
	try {
		Thread.sleep(3000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	p1.start();
	System.out.println(" x value is "+d1.getX());
}
}
