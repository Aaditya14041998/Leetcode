package dsa;

public class SlowestKey {

	public static void main(String[] args) {
		int[] releaseTimes1 = { 9, 29, 49, 50 };
		String keysPressed1 = "cbcd";
		System.out.println(slowestKey(releaseTimes1, keysPressed1));
	}

	private static char slowestKey(int[] releaseTimes, String keysPressed) {
		char maxKey = keysPressed.charAt(0);
		int maxDuration = releaseTimes[0];

		for (int i = 1; i < releaseTimes.length; i++) {
			int duration = releaseTimes[i] - releaseTimes[i - 1];
			char currentKey = keysPressed.charAt(i);

			if (duration > maxDuration || (duration == maxDuration && currentKey > maxKey)) {
				maxDuration = duration;
				maxKey = currentKey;
			}

		}

		return maxKey;
	}

}
