
public class variables {
	
	int myGlobalInt = 100;

	public static void main(String[] args) {
		// These are Primitive Data Types
		// String is a reference type, not a primitive data type
		
		/*
		 * Byte  (8 bits)
		 * Min: -128
		 * Max: 127
		 * Default: 0
		 */
		byte myByte = 100;
		System.out.println("Byte Value: " + myByte);
		
		
		/*
		 * Short
		 * Min: -32,768
		 * Max: 32,767
		 * Default: 0
		 */
		short myShort = 10000;
		System.out.println("Short Value: " + myShort);
		
		
		/*
		 * int
		 * Min: -2,147,483,648
		 * Max: 2,147,483,647
		 * Default: 0
		 */
		int myInt = 1000000;
		System.out.println("int Value: " + myInt);
		
		/*
		 * long
		 * Min: -2^63
		 * Max: 2^63 -1
		 * Default 0
		 */
		long myLong = 100000000;
		System.out.println("Long Value: " + myLong);
				
		/*
		 * float
		 * Default: 0.0f
		 * Not used for money/currency as float isn't accurate enough!
		 */
		float myFloat = 20.0f;
		System.out.println("Float Value: " + myFloat);
		
		/*
		 * double
		 * Default: 0.0d
		 * Used for money/currency as more accurate
		 */
		double myDouble = 21.0;
		System.out.println("Double Value: " + myDouble);
				
		/*
		 * boolean
		 * false and true
		 * Default: false
		 */
		boolean myBoolean = true;
		System.out.println("Boolean Value: " + myBoolean);
					
		/*
		 * char
		 * Min: 0
		 * Max: 65,535
		 * Char only holds a single character - string would hold more
		 * Char would use the unicode char set - assuming any alpha character
		 */
		char myChar = 'B';
		System.out.println("Char Value: " + myChar);
		
		
		
	}
	
	public void test() {
	} {
		myGlobalInt = 1000;
		
		
	}

}
