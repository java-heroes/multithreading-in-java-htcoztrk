package kodluyoruz.multithreading;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	//bu yontem runnable icin kullanildi
    	
      System.out.println("Main thread is starting");
          
          Task task = new Task("child1");
          Thread thread = new Thread(task);
        
          thread.start();
          for (int i = 0; i < 10; i++) {
              System.out.print(".");
              try {
                  Thread.sleep(100);
              } catch (InterruptedException e) {
                  System.out.println("Main thread is interrupted");
              }
          }
          System.out.println("Main thread is terminating");
    	
    	
      

    	
      }
    
}
