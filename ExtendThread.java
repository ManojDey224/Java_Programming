package java2;

class NewThread implements Runnable{
	Thread t;
	NewThread(){
		t = new Thread(this, "Demo Thread");
		System.out.println("child Thread");
	}
	public void run() {
		try {
			for(int n=5; n>0;n--) {
				System.out.println("child Thread :" +n);
				Thread.sleep(500);
			}
		}catch(InterruptedException n) {
			System.out.println("child Thread Interrupted");
		}
		System.out.println("Exiting child Thread");
	}
}
public class ExtendThread {

	public static void main(String[] args) {
		NewThread nt = new NewThread();
		nt.t.start();
		try {
			for(int n=5; n>0;n--){
				System.out.println("Main Thread :" +n);
				Thread.sleep(1000);
			}
		}catch(InterruptedException n) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Exiting main Thread");
	}

	}
