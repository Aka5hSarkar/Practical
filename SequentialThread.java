//execution of task one after another

package threading;

public class SequentialThread {
	static void run() {
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}System.out.println(i);
			
		}
	}
	public static void main(String[] args) {
		run();
	}

}
