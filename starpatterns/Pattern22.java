package starpatterns;

public class Pattern22 {

//	* 
//	** 
//	* * 
//	*  * 
//	*   * 
//	*  * 
//	* * 
//	** 
//	* 
	 
	public static void pattern22(int rows) { 
		System.out.println("pattern22"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j <= i; j++) { 
				if (i == j || j == 0) { 
					System.out.print("*"); 
				} else { 
					System.out.print(" "); 
				} 
			} 
			System.out.println(); 
		} 
		for (int i = rows - 2; i >= 0; i--) { 
			for (int j = 0; j <= i; j++) { 
				if (i == j || j == 0) { 
					System.out.print("*"); 
				} else { 
					System.out.print(" "); 
				} 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern22.pattern22(5);
	}

}
