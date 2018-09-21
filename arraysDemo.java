import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class arraysDemo {
	
	public static void main(String[] args) {
		
		//this is creating the reference only - not the array
		int[] myIntArray1 = {100, 90};
		//this creates the array - with allocation for 10 integers
		
		//myIntArray1 = new int[10];
		
		myIntArray1[0] = 100;
		myIntArray1[1] = 90;
		
		//empty array values default to "0"
		System.out.println("0 Index is: " + myIntArray1[0]);
		System.out.println("1st index is: " + myIntArray1[1]);
		//System.out.println("2nd index is: " + myIntArray1[2]);
		
		String[] myStringArray1 = {"bmw", "Audi", "Honda"};
		
		System.out.println("My String Array 0 is: " + myStringArray1[0]);
		System.out.println("My String Array 1 is: " + myStringArray1[1]);
		System.out.println("My String Array 2 is: " + myStringArray1[2]);
		
		int len1 = myIntArray1.length;
		int len2 = myStringArray1.length;
		
		System.out.println("Int array length: " + len1);
		System.out.println("String array length: " + len2);
		
		
		for (int i = 0; i < len1; i++) {
						System.out.println(myIntArray1[i]);
		}
		
		Arrays.sort(myIntArray1);
		
		for (int i = 0; i < len1; i++) {
						System.out.println(myIntArray1[i]);
			
		}
			
		//System.arraycopy(arg0, arg1, arg2, arg3, arg4);
				
	}

}
