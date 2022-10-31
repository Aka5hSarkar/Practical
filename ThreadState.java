package threading;
//by implementing the Runnable interface
class ThreadState2 implements Runnable{
	@Override
	public void run() {
		System.out.println("ThreadState2 Activated");
	}
}
//by extending the Thread class
public class ThreadState extends Thread {
	@Override
	public void run() {
		System.out.println("ThreadState Activated");
	}
	public static void main(String[] args) {
		ThreadState t1=new ThreadState();
		t1.start();
		ThreadState2 obj= new ThreadState2();
		Thread t2=new Thread(obj);
		t2.start();
		Thread t3=new Thread("Akash");
		System.out.println(t3.getName());
		Thread t4=new Thread(t3, "Anudip");

	}

}
