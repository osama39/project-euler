package problems;

public class No5 {

	public static void main(String[] args) {
		// the number must be larger than the multiple its prime numbers
		long i = 2 * 3 * 5 * 7 * 11 * 13 * 17 * 19;
		for (;; i += 19) {
			boolean flag = true;
			for (int j = 2; j <= 20; j++) {
				if (i % j != 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(i);
				break;
			}
		}
	}
}
