package LambdaExpressions;
interface darkLord{
	void star1();
	void star2();
}
public class LambdaIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		darkLord demon1=new darkLord() {  // Creating an anonymous class!!
			@Override
			public void star1() {
				System.out.println("I am a star");
			}
			public void star2() {
				System.out.println("I am a moon");
			}
		};
		demon1.star1();
		demon1.star2();

	}

}
