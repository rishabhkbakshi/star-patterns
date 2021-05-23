package starpatterns;

public class Pattern34 {
	
//	*  *  *   
//	 *  *  
//	*  *  *   
//	 *  *  
//	*  *  *   
	 
	public static void pattern34(int rows) { 
		System.out.println("pattern34"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < rows; j++) { 
				if (i % 2 == 0) { 
					if (j % 2 == 0) { 
						System.out.print("*  "); 
					} 
				} else { 
					if (j % 2 != 0) { 
						System.out.print(" * "); 
					} 
				} 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern34.pattern34(5);
	}
}
