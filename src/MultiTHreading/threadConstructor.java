package MultiTHreading;
class myThr extends Thread{
	public myThr(String name) {
		super(name);
		
	}
	public void run() {
		
			System.out.println("I am a thread");
		
			
	}
}
public class threadConstructor {
	public static void main(String[] args) {
		String name="tree";
		myThr m1= new myThr(name);
		m1.start();
		System.out.println(m1.getId());
		
	}

}
