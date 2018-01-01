
public class Stars {

	public static void main(String[]args) {
		
	StarsUp(5);
	
	}
	
	public static void StarsDown(int number) {	
		
		for(int i=1;i<=number; i++) { 
			
			for(int j=0; j<i; j++) {
				
				System.out.print("*"); 
			}
			System.out.println();	
		}
	}
	
	public static void StarsUp(int number) {
		  for(int i=0; i<number; i++) { 
			
			  for(int j=number; j>i; j--) { 
				  
				  System.out.print("*"); 
			  }
			  System.out.println();
		  }
	}
}

