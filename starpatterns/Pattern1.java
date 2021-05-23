package starpatterns;

public class Pattern1 {

	// *
	// **
	// ***
	// ****
	// *****
	public static void pattern1(int rows) {
		System.out.println("pattern1");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern1.pattern1(5);
	}
}
