package starpatterns;

public class Pattern37 {
	
//	********* 
//	 ******* 
//	  ***** 
//	   *** 
//	    * 
//	   *** 
//	  ***** 
//	 ******* 
//	********* 

	public static void pattern37(int rows) { 
		System.out.println("pattern37"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < 2 * rows - 1 - i; j++) { 
				if (i == j || j > i) { 
					System.out.print("*"); 
				} else { 
					System.out.print(" "); 
				} 
			} 
			System.out.println(); 
		} 
		for (int i = rows - 2; i >= 0; i--) { 
			for (int j = 0; j < 2 * rows - 1 - i; j++) { 
				if (i == j || j > i) { 
					System.out.print("*"); 
				} else { 
					System.out.print(" "); 
				} 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern37.pattern37(5);
	}
}
