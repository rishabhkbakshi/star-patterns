package starpatterns;

public class Pattern5 {
	
//    * 
//   *** 
//  ***** 
// ******* 
//********* 
	public static void pattern5(int rows) { 
		System.out.println("pattern5"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < rows + i; j++) { 
				if (j < rows - i - 1) { 
					System.out.print(" "); 
				} else { 
					System.out.print("*"); 
				} 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern5.pattern5(5);
	}
}
