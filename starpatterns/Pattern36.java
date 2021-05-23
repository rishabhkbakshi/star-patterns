package starpatterns;

public class Pattern36 {
	
//	********* 
//	 *     * 
//	  *   * 
//	   * * 
//	    * 
//	   * * 
//	  *   * 
//	 *     * 
//	********* 

	public static void pattern36(int rows) { 
		System.out.println("pattern36"); 
		for (int i = 0; i < 2 * rows - 1; i++) { 
			for (int j = 0; j < 2 * rows - i - 1; j++) { 
				if (i == j || j == 2 * rows - i - 2 || i == 0) { 
					System.out.print("*"); 
					if (i > rows - 1) { 
						for (int k = 0; k < i - j; k++) { 
							if (k == i - j - 1 || j == 0) { 
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
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern36.pattern36(5);
	}
}
