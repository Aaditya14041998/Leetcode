package dsa;

import java.util.HashMap;
import java.util.Map;

public class ContainDuplicate2 {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 1, 1 };
		int k = 3;
		boolean result = containsNearbyDuplicate(arr, k);
		System.out.println(result);
	}

	private static boolean containsNearbyDuplicate(int[] nums, int k) {

		Map<Integer, Integer> hp = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (!hp.containsKey(nums[i])) {
				hp.put(nums[i], i);
			} else {
				int pastIndex = hp.get(nums[i]);

				if (Math.abs(pastIndex - i) <= k) {
					return true;
				} else {
					hp.put(nums[i], i);
				}
			}
		}
		return false;

	}

}
