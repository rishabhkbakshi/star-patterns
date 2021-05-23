package starpatterns;

public class Pattern29 {
	
//	***** 
//	***** 
//	***** 
//	***** 
//	*****  
	public static void pattern29(int rows) { 
		System.out.println("pattern29"); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < rows; j++) { 
				System.out.print("*"); 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String[] args) {
		Pattern29.pattern29(5);
	}
}
