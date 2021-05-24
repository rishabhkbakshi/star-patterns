package starpatterns;

public class Pattern38 {
	
	
	//	*****
	//	  ****
	//	    ***
	//	      **
	//	        *
	//	      **
	//	    ***
	//	  ****
	//	*****
	public static void pattern38(int rows) {
		int counter = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows + i; j++) {
				if(i != 0 && j < i + counter) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			counter++;
			System.out.println();
		}
		for (int i = rows - 2; i >= 0; i--) {
			for (int j = 1; j < rows + i + 1; j++) {
				if(j < i + counter - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			counter--;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern38.pattern38(7);
	}

}
