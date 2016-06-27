import java.util.Scanner;

public class ThreadCounter {
	public static void main(String[] args){
		System.out.println("Press enter to stop the timer");
		Thread counter = new Thread(new Counter());
		counter.start();
		Scanner in = new Scanner(System.in);
		String s = "start";
		while(!s.equals("")){
			s=in.nextLine();
		}
		counter.interrupt();
		in.close();
	}
}
