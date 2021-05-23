package starpatterns;

public class Pattern9 {
	
//    * 
//   ** 
//  *** 
// **** 
//***** 
// **** 
//  *** 
//   ** 
//    * 
	public static void pattern9(int rows) { 
		System.out.println("pattern9"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < rows - i - 1; j++) { 
				System.out.print(" "); 
			} 
			for (int k = 0; k <= i; k++) { 
				System.out.print("*"); 
			} 
			System.out.println(); 
			if (i == rows - 1) { 
				for (int l = 0; l < rows - 1; l++) { 
					for (int m = rows - 1; m >= 0; m--) { 
						if (m < rows - 1 - l) { 
							System.out.print("*"); 
						} else { 
							System.out.print(" "); 
						} 
					} 
					System.out.println(); 
				} 
			} 
		} 
	} 

	public static void main(String[] args) {
		Pattern9.pattern9(5);
	}
}
