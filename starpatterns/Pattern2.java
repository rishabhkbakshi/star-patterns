package starpatterns;

public class Pattern2 {

//	 	* 
//	   ** 
//	  *** 
//	 **** 
//	***** 
	public static void pattern2(int rows) {
		System.out.println("pattern2");
		for (int i = 0; i < rows; i++) {
			for (int j = rows; j > i + 1; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern2.pattern2(5);
	}

}
