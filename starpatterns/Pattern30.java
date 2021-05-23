package starpatterns;

public class Pattern30 {
	
//	***** 
//	*   * 
//	*   * 
//	*   * 
//	***** 
	  
	public static void pattern30(int rows) { 
		System.out.println("pattern30"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < rows; j++) { 
				if (i == 0 || i == rows - 1) { 
					System.out.print("*"); 
				} else { 
					if (j == 0 || j == rows - 1) { 
						System.out.print("*"); 
					} else { 
						System.out.print(" "); 
					} 
				} 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern30.pattern30(5);
	}
}
