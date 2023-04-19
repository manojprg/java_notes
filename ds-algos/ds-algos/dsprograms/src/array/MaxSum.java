package array;

public class MaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int maxSoFar = Integer.MIN_VALUE, maxEndHere = 0;

		for (int i = 0; i < arr.length; i++) {
			maxEndHere = arr[i] + maxEndHere;
			if (maxEndHere < arr[i]) {
				maxEndHere = arr[i];
			}
			if (maxSoFar < maxEndHere) {
				maxSoFar = maxEndHere;
			}

		}

		System.out.println("Maximum sum = " + maxSoFar);
	}

}
