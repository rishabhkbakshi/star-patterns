package starpatterns;

public class Pattern7 {
	
//    * 
//   *** 
//  ***** 
// ******* 
//********* 
// ******* 
//  ***** 
//   *** 
//    * 
   
	public static void pattern7(int rows) { 
		System.out.println("pattern7"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < rows + i; j++) { 
				if (j < rows - i - 1) { 
					System.out.print(" "); 
				} else { 
					System.out.print("*"); 
				} 
			} 
			System.out.println(); 
			if (i == rows - 1) { 
				for (int k = 0; k < rows - 1; k++) { 
					for (int l = 2 * rows - 3; l >= k; l--) { 
						if (l >= 2 * rows - k - 3) { 
							System.out.print(" "); 
						} else { 
							System.out.print("*"); 
						} 
					} 
					System.out.println(); 
				} 
			} 
		} 
	} 

	public static void main(String[] args) {
		Pattern7.pattern7(5);
	}
}
