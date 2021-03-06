package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		// 4 =  1 0 0
		int num = 4;
		int numShifted = num << 1;
		
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println(numShifted);
		// 1 0 0 0
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		// shifting all bits one place to the left
		// 4. Try shifting num 3 places.
		numShifted = num << 3;
		System.out.println(numShifted);
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
}
