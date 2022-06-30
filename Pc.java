package java2;

class Q{
	int n;
	synchronized int get() {
		System.out.println("Got :", +n);
		return n;
	}
	synchronized void put(int n) {
		this.n=n;
		System.out.println("put :" +n);
	}
}
class producer implements Runnable{
	Q q;
	Thread t;
	producer(Q q){
		this.q=q;
		t= new Thread(this, "procedure");
	}
	public void run() {
		int i =0;
		while(true) {
			q.put(i++);
		}
		
	}
}
class Consumer implements Runnable{
	Q q;
	Thread t;
	Consumer(Q q){
		this.q =q;
		t =new Thread(this, "Consumer");
	}
	public void run() {
		while(true) {
			q.get();
		}
	}
}
public class Pc {

	public static void main(String[] args) {
		Q q= new Q();
		producer p = new producer(q);
		Consumer c = new Consumer(q);
		p.t.start();
		c.t.start();
		System.out.println("Press Control-c to stop.");
	}

}

