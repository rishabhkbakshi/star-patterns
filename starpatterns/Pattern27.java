package starpatterns;

public class Pattern27 {
	
//    * 
//   * * 
//  *   * 
// *     * 
//*       * 
// *     *     
//  *   *    
//   * *   
//    * 
  
	private static void pattern27(int rows) { 
		System.out.println("pattern27"); 
		int counter = 0; 
		for (int i = rows; i >= 0; i--) { 
			for (int j = 0; j < i; j++) { 
				if (j == i - 1) { 
					System.out.print("*"); 
					if (i < rows) { 
						counter++; 
						for (int k = 0; k < 2 * (counter); k++) { 
							if (k == 2 * (counter) - 1) { 
								System.out.print("*"); 
							} else { 
								System.out.print(" "); 
							} 
						} 
					} 
				} else { 
					System.out.print(" "); 
				} 
			} 
			if (i != 0) { 
				System.out.println(); 
			} else { 
				counter = 0; 
			} 
		} 
		for (int i = 0; i < rows - 1; i++) { 
			for (int j = 0; j < rows - 1; j++) { 
				if (i == j) { 
					System.out.print(" *"); 
					if (j != rows - 2) { 
						for (int k = 0; k <= (2 * (rows - 3 - j) + 1); k++) { 
							if (k == 2 * (rows - 3 - j)) { 
								System.out.print(" *"); 
							} else { 
								System.out.print(" "); 
							} 
						} 
						// System.out.println(); 
					} 
				} else { 
					System.out.print(" "); 
				} 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern27.pattern27(5);
	}

}
