package Methods;

public class basic1 {
	static int Demo () { // user define method declaration
		int x=50;
		int y=40;
		int z= x+y;
		return z;
		
		}
	
	static String Test() {  // here method name is Test()
	return "Testing"; 
	}
	
	public static void main(String[] args) {
		int z= Demo();
		/* here we call a method, which is user define
		 method name is Demo();
		it is user define method return integer type data */
		System.out.println(z);
		
		
		String a= Test();
		/*calling a string method i.e. Test()*/
		System.out.println(a);
		
		System.out.println("abcde");
		/*we can display any value but we need to define in main method, 
		bcoz SYSO work only in main method*/
		
	}



}
