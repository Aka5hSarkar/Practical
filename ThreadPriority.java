package threading;

public class ThreadPriority extends Thread {
	@Override
	public void run() {
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadPriority t1=new ThreadPriority();
		ThreadPriority t2=new ThreadPriority();
		ThreadPriority t3=new ThreadPriority();
		t2.setPriority(MAX_PRIORITY);
		System.out.println(t2.getPriority());
		System.out.println(Thread.currentThread().getPriority());
		t1.start();
		t2.start();
		t3.start();
		t1.setName("Akash");
		System.out.println(Thread.currentThread().getName());
		System.out.println(t2.getName());
	}

}
