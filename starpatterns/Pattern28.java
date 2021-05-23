package starpatterns;

public class Pattern28 {
	
//	 * * * * * 
//	  *     * 
//	   *   * 
//	    * * 
//	     * 
//	    * * 
//	   *   * 
//	  *     * 
//	 * * * * * 
	  
	public static void pattern28(int rows) { 
		System.out.println("pattern28"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < rows; j++) { 
				if (i == j || i == 0) { 
					System.out.print(" *"); 
				} else { 
					System.out.print(" "); 
					if (i > 0 && j == rows - 1) { 
						for (int k = 0; k < rows - 1 - i; k++) { 
							if (k == rows - 2 - i) { 
								System.out.print("*"); 
							} else { 
								System.out.print(" "); 
							} 
						} 
					} 
				} 
			} 
			System.out.println(); 
		} 
		for (int i = rows - 2; i >= 0; i--) { 
			for (int j = 0; j < rows; j++) { 
				if (i == j || i == 0) { 
					System.out.print(" *"); 
				} else { 
					System.out.print(" "); 
					if (i > 0 && j == rows - 1) { 
						for (int k = 0; k < rows - 1 - i; k++) { 
							if (k == rows - 2 - i) { 
								System.out.print("*"); 
							} else { 
								System.out.print(" "); 
							} 
						} 
					} 
				} 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern28.pattern28(5);
	}
}
