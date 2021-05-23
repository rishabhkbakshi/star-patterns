package starpatterns;

public class Pattern23 {
	
//    ***** 
//   *   *  
//  *   *   
// *   *    
//***** 
 
	public static void pattern23(int rows) { 
		System.out.println("pattern23"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = rows - 1; j >= 0; j--) { 
				if (i == rows - 1 || j == i) { 
					System.out.print("*"); 
					if (i != rows - 1) { 
						for (int k = rows - 2; k >= 0; k--) { 
							if (k == 0 || i == 0) { 
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
		Pattern23.pattern23(5);
	}

}
