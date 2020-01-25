package jtm.activity03;

import java.util.Arrays;

public class Array {
	static int[] array;

	public static void main(String[] args) {
		// TODO Use passed parameters for main method to initialize array
		// Hint: use Run— Run configurations... Arguments to pass parameters to
		// main method when calling from Eclipse
		// Sort elements in this array in ascending order
		// Hint: use Integer.parseInt(args[n]) to convert passed
		// parameters from String to int
		// Hint: use Arrays.sort(...) from
		// https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
		// START

		array = new int[7];
		for (int i = 0; i < 7; i++) {
			array[i] = Integer.parseInt(args[i]);
		}
		Arrays.sort(array);

		// END
	}

	public static void printSortedArray() {
		// TODO print content of array on standard output
		// Hint: use Arrays.toString(array) method for this
		// START
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		// END
	}

	public static int[] returnSortedArray() {
		// TODO return reference to this array
		// START
		
		Arrays.sort(array);

		// END
		return array;
	}
	

}
