package starpatterns;

public class Pattern35 {
	
//    *  
//   * *  
//  * * *  
// * * * *  
//* * * * *  
// * * * *  
//  * * *  
//   * *  
//    *  

	public static void pattern35(int rows) { 
		System.out.println("pattern35"); 
		for (int i = 0; i <= rows - 1; i++) { 
			for (int j = rows - 1; j >= i; j--) { 
				System.out.print(" "); 
			} 
			for (int k = 0; k <= i; k++) { 
				System.out.print("* "); 
			} 
			System.out.println(""); 
		} 
		for (int i = 0; i < rows - 1; i++) { 
			for (int j = -1; j <= i; j++) { 
				System.out.print(" "); 
			} 
			for (int k = 0; k <= rows - 2 - i; k++) { 
				System.out.print("* "); 
			} 
			System.out.println(""); 
		} 
	} 

	public static void main(String[] args) {
		Pattern35.pattern35(5);
	}
}
