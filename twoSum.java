// 2 Sum Problem
// Abhishek Ramesh

import java.util.*;

public class twoSum {

	// This creates the array of values and the sum value
	public static int[] num = {2, 12, 8, 7};
	public static int sum = 9;

	// This creates checks which 2 values in the array summed up result in the sum value.
	public static int [] twoSum(int[] num, int sum){
		boolean found = false;
		for (int i = 0; i < num.length; i++){

			// The difference value to between sum value and ith integer in array 
			int diff = sum - num[i];

			// Breaks the loop when a combination is found
			if (found == true){
				break;
			}

			// Finds which jth integer in array equals to the difference
			for (int j = 0; j < num.length; j++){
				if ((diff == num[j]) && (num[j] != num[i])){
					found = true;
					System.out.println("[" + i + ", " + j + "]");
					break;
				}
			}
		}

		if (found == false){
			System.out.println(-1);
		}

		return num;
	}

	// Main Function
	public static void main(String[] args) {
		System.out.println("Number array is: " + Arrays.toString(num));
		System.out.println("Sum Value required is: " + Integer.toString(sum));

		twoSum(num, sum);
	}

}