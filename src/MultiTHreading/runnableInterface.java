package MultiTHreading;
/*
 * Lifecycle Of a Thread
 * 1.New- object created but start() not invoked
 * 2.Runnable- after invoking start() it will be added to thread scheduler
 * 3.Running- thread scheduler selected and it is in alive state
 * 4.Terminated- run() has exited.
 */

class myRunnable1 implements Runnable{
	public void run() {
		System.out.println("I am a thread111111");
	}
}
class myRunnable2 implements Runnable{
	public void run() {
		System.out.println("I am a thread2222222");
	}
}
public class runnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myRunnable1 t1= new myRunnable1();
		Thread m1=new Thread(t1);
		myRunnable2 t2= new myRunnable2();
		Thread m3=new Thread(t2);
		m1.start();
		m3.start();

	}

}
