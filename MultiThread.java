package java2;

class NewThread1 implements Runnable{
	String name;
	Thread t;
	NewThread1(String threadname){
		name = threadname;
		t = new Thread(this,name);
		System.out.println("New thread1 " +t);
	}
	public void run() {
		try {
			for(int n=5; n>0;n--) {
				System.out.println(name+" : " +n);
				Thread.sleep(500);
			}
		}catch(InterruptedException n) {
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + "Exiting");
	}
}
public class MultiThread {

	public static void main(String[] args) {
		NewThread1 n1 = new NewThread1("one");
		NewThread1 n2 = new NewThread1("two");
		NewThread1 n3 = new NewThread1("three");
		n1.t.start();
		n2.t.start();
		n3.t.start();
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Exiting main Thread");
	}

	}
