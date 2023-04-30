package MultiTHreading;
class myThread extends Thread{
	@Override
	public void run() {
		
		System.out.println("My thread is running");
		
	}
}
public class threadingConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arguments are actual
		//concurrency is showing that doing one thing at a time but simultaneously.
		//parallelism is the task of running multiple computations
		/*thread methods
		 * 
		 */
		myThread t1=new myThread();
		t1.start();

	}

}
