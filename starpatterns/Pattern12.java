package starpatterns;

public class Pattern12 {
//	***** 
//	**** 
//	*** 
//	** 
//	* 
//	** 
//	*** 
//	**** 
//	***** 
	 
	public static void pattern12(int rows) { 
		System.out.println("pattern12"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = rows - i - 1; j >= 0; j--) { 
				System.out.print("*"); 
			} 
			System.out.println(); 
			if (i == rows - 1) { 
				for (int k = 2; k <= rows; k++) { 
					for (int l = 0; l < k; l++) { 
						System.out.print("*"); 
					} 
					System.out.println(); 
				} 
			} 
		} 
	} 

	public static void main(String[] args) {
		Pattern12.pattern12(5);
	}

}
