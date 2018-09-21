
public class classDemo {
	
	static String str2 = "Hi There!";
	//cannot perform anything outside of a method, but you can't run any code from outside the method

	/*
	 * [][][][CarClass - c1][CarClass - c2][][]
	 * These are just variables
	 * @param args
	 */
	
	public static void main(String[] args) {
		//This is always the entry point (String[] args)
		//classes are where you write methods and everything else. 
		//everything is contained in classes
		
		//method is a way to do something - method to do something!
		//way to achieve something
		
		String str1 = "Hello Java!";
		
		System.out.println(str1);
		
		System.out.println(str2);
		
//		 for (int i=0; i < args.length; i++) {
//		 System.out.println(args[i]);
//	}
		 
		System.out.println("**************");
		 
		CarClass c1 = new CarClass();
		CarClass c2 = new CarClass();
		
//		c1.model = "BMW";
//		c1.year = 2015;
		
		System.out.println(c1.year);
		System.out.println(c1.model);
		System.out.println(c1.getYear());
			
		
		}

}

//Classes are also objects?
class CarClass {
	
	int year = 2000; //this will not change as it's using the default value in the object variable
	String model = "BMW";
	
	public int getYear() {
		return this.year;
	}

	
}