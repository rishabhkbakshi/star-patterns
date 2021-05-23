package starpatterns;

public class Pattern25 {

//	*        * 
//	**      ** 
//	***    *** 
//	****  **** 
//	********** 
//	****  **** 
//	***    *** 
//	**      ** 
//	*        * 
	 
	public static void pattern25(int rows) { 
		System.out.println("pattern25"); 
		for (int i = 0; i <= rows - 1; i++) { 
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
		for (int i = rows - 2; i >= 0; i--) { 
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
		Pattern25.pattern25(5);
	}
}
