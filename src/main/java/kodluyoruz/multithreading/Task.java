package kodluyoruz.multithreading;

public class Task implements Runnable{

	private String taskName;
	public Task(String name) {
		this.taskName=name;
	}
	@Override
	public void run() {
		System.out.println(taskName+"is starting.");
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(400);
				System.out.println("In "+taskName+"count is "+ i);
			}
			catch (InterruptedException e) {
                System.out.println(taskName + " is interrupted");
            }
		}
		  System.out.println(taskName + " is terminating");
	}

	
}
