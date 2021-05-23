package starpatterns;

public class Pattern33 {
	
//	  ***  
//	 *   * 
//	 *   * 
//	 *   * 
//	  ***  
//	 *   * 
//	 *   * 
//	 *   * 
//	  ***  
	  
 	public static void pattern33(int rows) { 
 		System.out.println("pattern33"); 
 		for (int i = 0; i < rows; i++) { 
 			for (int j = 0; j < rows; j++) { 
 				if (i == 0 || i == rows - 1) { 
 					if (j == 0 || j == rows - 1) { 
 						System.out.print(" "); 
 					} else { 
 						System.out.print("*"); 
 					} 
 				} else { 
 					if (j == 0 || j == rows - 1) { 
 						System.out.print("*"); 
 					} else { 
 						System.out.print(" "); 
 					} 
 				} 
 			} 
 			System.out.println(); 
 		} 
 		for (int i = 1; i < rows; i++) { 
 			for (int j = 0; j < rows; j++) { 
 				if (i == rows - 1) { 
 					if (j == 0 || j == rows - 1) { 
 						System.out.print(" "); 
 					} else { 
 						System.out.print("*"); 
 					} 
 				} else { 
 					if (j == 0 || j == rows - 1) { 
 						System.out.print("*"); 
 					} else { 
 						System.out.print(" "); 
 					} 
 				} 
 			} 
 			System.out.println(); 
 		} 
 	} 

	public static void main(String[] args) {
		Pattern33.pattern33(5);
	}
}
