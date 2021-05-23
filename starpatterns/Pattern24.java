package starpatterns;

public class Pattern24 {

//	***** 
//	 *   *    
//	  *   *   
//	   *   *  
//	    ***** 

	public static void pattern24(int rows) { 
		System.out.println("pattern24"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < rows; j++) { 
				if (i == 0 || j == i) { 
					System.out.print("*"); 
					if (i > 0) { 
						for (int k = 0; k < rows - 1; k++) { 
							if (k == rows - 2 || i == rows - 1) { 
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
		Pattern24.pattern24(5);
	}

}
