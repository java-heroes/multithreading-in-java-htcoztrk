package kodluyoruz.multithreading;

public class OrnekTask implements Runnable{

	private String taskName;
	public OrnekTask(String name) {
		this.taskName=name;
	}
	@Override
	public void run() {
		System.out.println(taskName+" baslıyor.");
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(400);
				System.out.println(taskName+" numarası "+ i);
			}
			catch (InterruptedException e) {
                System.out.println(taskName + " kesintiye ugradi.");
            }
		}
		  System.out.println(taskName + " sonlandirildi.");
	}

	
}
