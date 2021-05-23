package starpatterns;

public class Pattern3 {
	// *****
	// ****
	// ***
	// **
	// *
	public static void pattern3(int rows) {
		System.out.println("pattern3");
		for (int i = 0; i < rows; i++) {
			for (int j = rows; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern3.pattern3(5);
	}
}
