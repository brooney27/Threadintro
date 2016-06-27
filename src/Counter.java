
public class Counter implements Runnable {
	public void run(){
		Thread ct=Thread.currentThread();
		int count = 1;
		System.out.println("Start count");
		
		while(true){
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){
				break;
			}
			System.out.println("Time: " + count + " seconds");
			count++;
		}
		System.out.println("Time stopped");
	}
}
