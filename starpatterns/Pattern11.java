package starpatterns;

public class Pattern11 {
	
//	***** 
//	 ***** 
//	  ***** 
//	   ***** 
//	    ***** 
	  
	public static void pattern11(int rows) { 
		System.out.println("pattern11"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < rows + i; j++) { 
				if (i <= j) { 
					System.out.print("*"); 
				} else { 
					System.out.print(" "); 
				} 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern11.pattern11(5);
	}

}
