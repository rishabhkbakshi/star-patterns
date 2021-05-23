package starpatterns;

public class Pattern6 {
	
//	********* 
//	 ******* 
//	  ***** 
//	   *** 
//	    * 
	 
	public static void pattern6(int rows) { 
		System.out.println("pattern6"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 2 * rows - 2; j >= i; j--) { 
				if (j >= 2 * rows - i - 1) { 
					System.out.print(" "); 
				} else { 
					System.out.print("*"); 
				} 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern6.pattern6(5);
	}
}
