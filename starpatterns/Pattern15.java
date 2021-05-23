package starpatterns;

public class Pattern15 {

//	* 
//	** 
//	* * 
//	*  * 
//	***** 

	public static void pattern15(int rows) { 
			System.out.println("pattern15"); 
			for (int i = 0; i < rows; i++) { 
				for (int j = 0; j < i + 1; j++) { 
					if (j == 0 || i == rows - 1 || j == i) { 
						System.out.print("*"); 
					} else { 
						System.out.print(" "); 
					} 
				} 
				System.out.println(); 
			} 
	} 

	public static void main(String[] args) {
		Pattern15.pattern15(5);
	}

}
