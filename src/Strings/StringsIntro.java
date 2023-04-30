package Strings;

public class StringsIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="SPRIGGAN"; // String intialized with literals
		// String intialised with literals are usually stored in String pool table
		System.out.println(name);
		
		
		String anotherName=new String("PhantomBeast");// String created as an object
       // When String is created using new object the string will be stored in heap area as well as in String pool. It implies that there will be two strings generated
       
		System.out.println(anotherName);
        String dark="black";
        String darker= new String("black");
        
        System.out.println(dark==darker); // It implies that String in string pool is different than the string in heap area
        String moreDark="black";
        System.out.println(dark==moreDark);// String created in string pool is same
        String fruits="Guava, Apple, Orange, Pineapple, Grapes";
        String[] arrFruits= fruits.split(",");
        for(String items: arrFruits) {
        	System.out.print(items);
        }
	}
	
	//String Functions:
	//char charAt(int index)
	// int length()
	//String substring(int beginIndex)
	//String substring(int beginIndex, int endIndex)
	//boolean contains(CharSequence s)
    // String[] split(String regex)   "regex= regular expression
}
