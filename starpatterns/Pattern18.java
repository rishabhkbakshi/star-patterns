package starpatterns;

public class Pattern18 {

//	***** 
//	 *  * 
//	  * * 
//	   ** 
//	    * 
	 
	public static void pattern18(int rows) { 
		System.out.println("pattern18"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < rows; j++) { 
				if (i == 0 || j == rows - 1 || j == i) { 
					System.out.print("*"); 
				} else { 
					System.out.print(" "); 
				} 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern18.pattern18(5);
	}
}
