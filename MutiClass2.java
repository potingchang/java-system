package mypractice;

public class MutiClass2 {
	private final static int n_max = 3;
	private final static int my_max = 9;
	private final static int mx_max = 3;

	public static void main(String[] args) {

		for (int n = 0; n < n_max; n++) {
			for (int y = 1; y <= my_max; y++) {
				for (int x = 1; x <= mx_max; x++) {
					int _x = 3 * n + x;
					System.out.print(_x + "*" + y + "=" + _x * y + "\t");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}

	}

}

// class Space {
// private static void spc() {
// System.out.println();
// }
// }