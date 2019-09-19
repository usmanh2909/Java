package Collections;

public class Pyramid {

	public static void main(String[] args) {
		int num = 5;
		
		for(int r=1; r<=num;r++) {
			
			for(int sp=(num-r);sp>=1;sp--) {
				System.out.print(" ");
			}
			for(int st=1;st<=(r*2)-1;st++) {
				
				System.out.print("*");
				//System.out.println();
				
			}
			System.out.println();
			
			}
		
	}

}
