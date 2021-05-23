package starpatterns;

public class Pattern16 {
	
//    * 
//   ** 
//  * * 
// *  * 
//***** 

	public static void pattern16(int rows) { 
		System.out.println("pattern16"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < rows; j++) { 
				if (i == rows - 1 || j == rows - 1 || j == rows - i - 1) { 
					System.out.print("*"); 
				} else { 
					System.out.print(" "); 
				} 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern16.pattern16(5);
	}
}
