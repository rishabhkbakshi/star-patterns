package starpatterns;

public class Pattern21 {
	
//    * 
//   ** 
//  * * 
// *  * 
//*   * 
// *  * 
//  * * 
//   ** 
//    * 
 
	public static void pattern21(int rows) { 
		System.out.println("pattern21"); 
		for (int i = rows - 1; i >= 0; i--) { 
			for (int j = 0; j < rows; j++) { 
				if (i == j || j == rows - 1) { 
					System.out.print("*"); 
				} else { 
					System.out.print(" "); 
				} 
			} 
			System.out.println(); 
		} 
		for (int i = 1; i < rows; i++) { 
			for (int j = 0; j < rows; j++) { 
				if (i == j || j == rows - 1) { 
					System.out.print("*"); 
				} else { 
					System.out.print(" "); 
				} 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern21.pattern21(5);
	}

}
