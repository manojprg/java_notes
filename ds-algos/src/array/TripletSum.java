package array;

import java.util.Arrays;

public class TripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 5, 32, 1, 7, 10, 50, 19, 21, 2 };
		Arrays.sort(arr);

		for (int i = arr.length - 1; i >= 0; i--) {
			int init = 0;
			int last = i - 1;
			while (init < last) {
				if (arr[i] == arr[init] + arr[last]) {
					System.out.println("numbers are " + arr[i] + " " + arr[init] + " " + arr[last]);
					break;
				} else if (arr[i] > arr[init] + arr[last])
					init += 1;
				else
					last -= 1;
			}
		}

	}

}
