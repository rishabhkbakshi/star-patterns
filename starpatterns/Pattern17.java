package starpatterns;

public class Pattern17 {
	
//	***** 
//	*  * 
//	* * 
//	** 
//	* 

	public static void pattern17(int rows) { 
		System.out.println("pattern17"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < rows - i; j++) { 
				if (i == 0 || j == 0 || j == rows - i - 1) { 
					System.out.print("*"); 
				} else { 
					System.out.print(" "); 
				} 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern17.pattern17(5);
	}
}
