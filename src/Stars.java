
public class Stars {

	public static void main(String[]args) {
		
	StarsDown(15);
	
	}
	
	public static void StarsDown(int number) {	
		
		for(int i=1;i<=number; i++) { 
			
			for(int j=0; j<i; j++) {
				
				System.out.print("*"); 
			}
				System.out.println();	
		}
		
	}
	
	
}
