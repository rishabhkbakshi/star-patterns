package starpatterns;

public class Pattern26 {
	
//	********** 
//	****  **** 
//	***    *** 
//	**      ** 
//	*        * 
//	**      ** 
//	***    *** 
//	****  **** 
//	********** 
	 
	public static void pattern26(int rows) { 
		System.out.println("pattern26"); 
		for (int i = rows - 1; i >= 0; i--) { 
			for (int j = 0; j <= rows - 1; j++) { 
				if (i == j || i > j) { 
					System.out.print("*"); 
				} else { 
					System.out.print(" "); 
				} 
			} 
			for (int j = rows - 1; j >= 0; j--) { 
				if (i == j || i > j) { 
					System.out.print("*"); 
				} else { 
					System.out.print(" "); 
				} 
			} 
			System.out.println(); 
		} 
		for (int i = 1; i <= rows - 1; i++) { 
			for (int j = 0; j <= rows - 1; j++) { 
				if (i == j || i > j) { 
					System.out.print("*"); 
				} else { 
					System.out.print(" "); 
				} 
			} 
			for (int j = rows - 1; j >= 0; j--) { 
				if (i == j || i > j) { 
					System.out.print("*"); 
				} else { 
					System.out.print(" "); 
				} 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern26.pattern26(5);
	}
}
