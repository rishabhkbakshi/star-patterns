package starpatterns;

public class Pattern4 {
	
//	***** 
//	 **** 
//	  *** 
//	   ** 
//	    *   
	public static void pattern4(int rows) { 
		System.out.println("pattern4");
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < i; j++) { 
				System.out.print(" "); 
			} 
			for (int k = rows; k > i; k--) { 
				System.out.print("*"); 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern4.pattern4(5);
	}
}
