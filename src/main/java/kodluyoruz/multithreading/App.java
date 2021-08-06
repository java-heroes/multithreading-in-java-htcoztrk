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
    	
      System.out.println("Ana thread başlıyor.");
          
          OrnekTask ornekTask = new OrnekTask("CocukTask");
          Thread thread = new Thread(ornekTask);
        
          thread.start();
          for (int i = 0; i < 10; i++) {
              System.out.print(".");
              try {
                  Thread.sleep(100);
              } catch (InterruptedException e) {
                  System.out.println("Ana thread kesintiye ugradi.");
              }
          }
          System.out.println("Ana thread sonlandi.");
    	
    	
      

    	
      }
    
}
