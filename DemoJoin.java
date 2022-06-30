package java2;

class NewThread2 implements Runnable{
	String name;
	Thread t;
	NewThread2(String threadname){
		name = threadname;
		t = new Thread(this,name);
		System.out.println("New thread2 " +t);
	}
	public void run() {
		try {
			for(int n=5; n>0;n--) {
				System.out.println(name+" : " +n);
				Thread.sleep(1000);
			}
		}catch(InterruptedException n) {
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + "Exiting");
	}
}
public class DemoJoin {

	public static void main(String[] args) {
		NewThread2 n1 = new NewThread2("one");
		NewThread2 n2 = new NewThread2("two");
		NewThread2 n3 = new NewThread2("three");
		n1.t.start();
		n2.t.start();
		n3.t.start();
		System.out.println("Thread one is alive: " + n1.t.isAlive());
		System.out.println("Thread one is alive: " + n2.t.isAlive());
		System.out.println("Thread one is alive: " + n3.t.isAlive());
		try {
			System.out.println("Waiting for threads to finish: ");
			n1.t.join();
			n2.t.join();
			n3.t.join();
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Thread one is alive: " + n1.t.isAlive());
		System.out.println("Thread one is alive: " + n2.t.isAlive());
		System.out.println("Thread one is alive: " + n3.t.isAlive());
	}
}
