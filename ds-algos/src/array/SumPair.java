package array;

import java.util.HashSet;
import java.util.Set;

public class SumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5, 6, 2, 1 };
		Set<Integer> set = new HashSet<>();
		int target = 4;

		for (int i = 0; i < arr.length; i++) {

			int diff = target - arr[i];
			if (set.contains(diff)) {
				System.out.println("(" + arr[i] + "," + diff + ")");
			}
			set.add(arr[i]);
		}
	}

}
