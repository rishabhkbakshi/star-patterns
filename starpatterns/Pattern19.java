package starpatterns;

public class Pattern19 {
	
//    * 
//   * *   
//  *   *     
// *     *       
//********* 
 
	public static void pattern19(int rows) { 
		System.out.println("pattern19"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < rows + i; j++) { 
				if (i == rows - 1) { 
					System.out.print("*"); 
				} else if (i == rows - 1 - j) { 
					System.out.print("*"); 
					for (int k = 1; k < rows - j; k++) { 
						if (k == i) { 
							System.out.print(" *"); 
						} else { 
							System.out.print("  "); 
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
		Pattern19.pattern19(5);
	}

}
