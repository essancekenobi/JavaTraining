
public class stringDemo {

	public static void main(String[] args) {
		//reference datatype
		
		//String Literal - String Constant Pool
		
		String str1 = "Hello";
		// str1 = reference to the object
		// "Hello" is the object
		System.out.println(str1);

		//String are immutable!
		//Creating a new string does not remove the object, it only changes the reference. 
		
		String str3 = "Hello";
		// Creating a second reference with the same object doesn't create a second object, 
		// it just creates a new reference to the same Object in the String Constant Pool.
		System.out.println("String Value: " + str3);
		
		
		// String Object - Heap
		
		String str2 = new String("Welcome");
		// str2 is reference that we use to access the object
		System.out.println("String Value: " + str2);
		
		String str4 = new String ("Welcome");
		// str4 is reference that we use to access the object
		// str4 creates a new object and new reference - this does not just use a second reference as 
		// with a String Literal. This creates a second object in the Heap
		// this ends up wasting memory!
		System.out.println(str4);
		
		String stradd = str1 + str2;
		//this will just call the objects using the references to concatanate the strings
		System.out.println(stradd);
		
		
		

	}

}
