package starpatterns;

public class Pattern31 {
	
//	*    *  
//	 *  *   
//	  *    
//	 *  *   
//	*    *  
	  
	public static void pattern31(int rows) { 
		System.out.println("pattern31"); 
		for (int i = 1; i <= rows; i++) { 
			for (int j = 1; j <= rows; j++) { 
				if (j == i || j == rows - i + 1) { 
					System.out.print("*"); 
				} 
				System.out.print(" "); 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern31.pattern31(5);
	}
}
