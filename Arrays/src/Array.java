

import java.io.*;
import java.util.*;

class TwoDArrays {
	public static void main(String[] args)
	{
		int[][] scores = new int[2][2];
		// Initializing array element at position[0][0],
		// i.e. 0th row and 0th column
		scores[0][0] = 15;
		// Initializing array element at position[0][1],
		// i.e. 0th row and 1st column
		scores[0][1] = 23;
		// Initializing array element at position[1][0],
		// i.e. 1st row and 0th column
		scores[1][0] = 30;
		// Initializing array element at position[1][1],
		// i.e. 1st row and 1st column
		scores[1][1] = 21;

		// printing the array elements individually
		System.out.println("scores[0][0] = "
						+ scores[0][0]);
		System.out.println("scores[0][1] = "
						+ scores[0][1]);
		System.out.println("scores[1][0] = "
						+ scores[1][0]);
		System.out.println("scores[1][1] = "
						+ scores[1][1]);
		// printing 2D array using Arrays.deepToString() method
		System.out.println(
			"Printing 2D array using Arrays.deepToString() method: ");
		System.out.println(Arrays.deepToString(scores));
	}
}