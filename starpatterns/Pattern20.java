package starpatterns;

public class Pattern20 {
	
//	********* 
//	 *     * 
//	  *   * 
//	   * * 
//	    * 
	 
	
	public static void pattern20(int rows) { 
		System.out.println("pattern20"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < 2 * rows - 1 - i; j++) { 
				if (i == 0 || i == j || j == 2 * rows - 2 - i) { 
					System.out.print("*"); 
				} else { 
					System.out.print(" "); 
				} 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern20.pattern20(5);
	}
}
