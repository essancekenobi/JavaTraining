
public class stringMethods {

	public static void main(String[] args) {
		
		String str = "This is the test string";
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Welcome";
		//strings start at 0
		String str4 = ""; //empty string
		String str5 = "   Spaces all around   ";
		String str6 = "Hello";
		
		//String Length
		//Will give the length of the string 
		System.out.println("Length of the string is: " + str.length());
		
		//finds character at position in arg
		//Strings start at 0, so the below should return "i"
		System.out.println("Character at index 2 is: " + str.charAt(2));
		
		//This will append 2 strings together
		//Will print out the string in 'str' and then append the string in the arg to it
		//Be careful of spacing, if it is important
		System.out.println(str.concat(" This is the appended string"));
		
		//This will show is something is contained in the string 
		// with a true or false given
		System.out.println("Contains check 1: " + str.contains("is"));
		System.out.println("Contains check 2: " + str.contains("si"));
		
		//This will show if a string starts with what is contained in the arg 
		// True or false given accordingly
		System.out.println("Starts with check 1: " + str.startsWith("This"));
		System.out.println("Starts with check 2: " + str.startsWith("is"));
		
		//This will show if a string ends with what is contained in the arg
		//True or False given
		System.out.println("Ends with check 1: " + str.endsWith("string"));
		System.out.println("Ends with check 2: " + str.endsWith("is"));
		
		//This will show if 2 strings are equal (first string in main and then second string in arg)
		//True or false given
		System.out.println("Checks contents of the Strings are equal: " + str1.equals(str2));
		System.out.println("Checks contents of the Strings are equal: " + str1.equals(str3));
		
		//Gives a number for the index of the character if it exists in the string, 
		//but will give a "-1" if it does not exist in the string
		System.out.println("Index of 'i' is: " + str.indexOf('i'));
		
		//Will return true if string is empty
		//Will return false if string is not empty
		System.out.println("Check if string is empty: " + str.isEmpty());
		System.out.println("Check if string is empty: " + str4.isEmpty());
		
		//Will remove both leading and trailing spaces
		System.out.println("Trim the leading and trailing spaces: " + str5.trim());
		
		//Replace example for str6 above
		System.out.println("Replace Example: " + str6.replace('e', 'a'));
		
		//returns part of the string; from the start of the string
		//remember that strings start with '0'
		System.out.println("String example1: " + str.substring(5));
		
		//returns the objects in the string between the start and end index values given in argument(s)
		System.out.println("String Example 2: " + str.substring(5,10));
		
		//Adds the string into an Array
		char[] charArray = str.toCharArray();
		for (int i = 0; i<charArray.length; i++) {
			System.out.println("Index " + i + " is: " + charArray[i]);
				}
		
		//Convert every character to lower case
		System.out.println("String to all lower case: " + str.toLowerCase());
		
		//convert every character to upper case
		System.out.println("String to all upper case: " + str.toUpperCase());
		
		
	}
	
	
	
	

}
