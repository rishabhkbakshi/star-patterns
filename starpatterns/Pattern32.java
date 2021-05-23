package starpatterns;

public class Pattern32 {
	
//      *       
//      *       
//      *       
//      *       
//      *       
//      *       
//************* 
//      *       
//      *       
//      *       
//      *       
//      *       
//      *     

	public static void pattern32(int rows) { 
		System.out.println("pattern32"); 
		for (int i = 0; i < 2 * rows - 1; i++) { 
			for (int j = 0; j < 2 * rows - 1; j++) { 
				if (j == rows - 1 || i == rows - 1) { 
					System.out.print("*"); 
				} else { 
					System.out.print(" "); 
				} 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern32.pattern32(5);
	}
}
