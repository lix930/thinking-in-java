public class exercise1 {
	public static void main(String[] args) {
		for (int i=0; i<=10; i++)
			new Thread(new ExerciseThread()).start();
	}
}

class ExerciseThread implements Runnable {
	
	private static int taskCount = 0;
	
	private final int id = taskCount++;
	
	protected int countDown = 4;
	
	public ExerciseThread() {
		System.out.println("Thread " + id + " is begining!");
	}
	public void status(int countDown) {
		if (countDown > 0)
			System.out.println("Thread " + id + " in run() " + countDown + "th. ");	
		if (countDown == 0)
			System.out.println("Thread " + id + " is end!!!");
	}
	
	public void run() {
		while(countDown-- >= 0){
			status(countDown);
			Thread.yield();
		}
	}
}
