package starpatterns;

public class Pattern13 {
//	***** 
//	 **** 
//	  *** 
//	   ** 
//	    * 
//	   ** 
//	  *** 
//	 **** 
//	***** 

	public static void pattern13(int rows) { 
		System.out.println("pattern13"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < rows; j++) { 
				if (i == j || j > i) { 
					System.out.print("*"); 
				} else { 
					System.out.print(" "); 
				} 
			} 
			System.out.println(); 
			if (i == rows - 1) { 
				for (int k = 0; k < rows - 1; k++) { 
					for (int l = rows - 2; l >= -1; l--) { 
						if (k >= l) { 
							System.out.print("*"); 
						} else { 
							System.out.print(" "); 
						} 
					} 
					System.out.println(); 
				} 
			} 
		} 
	} 

	public static void main(String[] args) {
		Pattern13.pattern13(5);
	}

}
