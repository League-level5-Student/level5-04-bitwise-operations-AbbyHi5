package _03_Printing_Binary;

import java.util.Iterator;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	static public void printByteBinary(byte b) {
		//System.out.println("");
		// We first want to print the bit in the one's place
		//System.out.println(b);
		// Shift b seven bits to the right
		for (int i = 7; i >= 0; i--) {
			byte shifted = (byte) (b >> i);
			// Use the & operator to "mask" the bit in the one's place
			// This can be done by "anding" (&) it with the value of 1
			int num = shifted & 1;
			// Print the result using System.out.print (NOT System.out.println)
			System.out.print(num);
			//Use this method to print the remaining 7 bits of b
		}
		
		
	}
	
	public static void printShortBinary(short s) {
		
		// Create 2 byte variables
		byte byte1;
		byte byte2;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		byte1 = (byte) (s >> 8);
		byte2 = (byte) s;
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
		printByteBinary(byte1);
		printByteBinary(byte2);
	}
	
	public static void printIntBinary(int i) {
		// Create 2 short variables
		short short1;
		short short2;
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		short1 = (short) (i >> 16);
		short2 = (short) i;
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
		printShortBinary(short1);
		printShortBinary(short2);
	}
	
	static public void printLongBinary(long l) {
		// Use the same method as before to complete this method
		int int1;
		int int2;
		
		int1 = (int) (l >> 32);
		int2 = (int) l;
		
		printIntBinary(int1);
		printIntBinary(int2);
	}
	
	public static void main(String[] args) {
		// Test your methods here
		
		printByteBinary((byte) 1234567);
		System.out.println("");
		printShortBinary((short) 123456789);
		System.out.println("");
		printIntBinary(1234567890);
		System.out.println("");
		printLongBinary((long) 1234567890);
	}
}
