package starpatterns;

public class Pattern14 {

//	* * * * *  
//	 * * * *  
//	  * * *  
//	   * *  
//	    *  
//	   * *  
//	  * * *  
//	 * * * *  
//	* * * * *  
	 
	public static void pattern14(int rows) { 
		System.out.println("pattern14"); 
		for (int i = rows - 1; i >= 0; i--) { 
			for (int j = 0; j <= i; j++) { 
				if (i == j || i > 0) { 
					if (j == 0) { 
						for (int k = 0; k < rows - 1 - i; k++) { 
							System.out.print(" "); 
						} 
					} 
					System.out.print("* "); 
				} 
			} 
			System.out.println(); 
		} 
		for (int i = 1; i < rows; i++) { 
			for (int j = 0; j <= i; j++) { 
				if (i == j || i > 0) { 
					if (j == 0) { 
						for (int k = 0; k < rows - 1 - i; k++) { 
							System.out.print(" "); 
						} 
					} 
					System.out.print("* "); 
				} 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern14.pattern14(5);
	}

}
