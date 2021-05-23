package starpatterns;

public class Pattern8 {

	// *
	// **
	// ***
	// ****
	// *****
	// ****
	// ***
	// **
	// *

	public static void pattern8(int rows) {
		System.out.println("pattern8");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i == rows - 1) {
				for (int k = rows - 1; k > 0; k--) {
					for (int j = 0; j < k; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
	}

	public static void main(String[] args) {
		Pattern8.pattern8(5);
	}

}
