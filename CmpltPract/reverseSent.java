import java.util.Scanner;

public class reverseSent {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a String");
		//String s = sc.nextLine();
		String s = "The quick brown fox jumps over the lazy dog";
		String rev ="";
		String []s1=s.split(" ");
		for(int i=s1.length-1;i>=0;i--) {
			
			 rev += (s1[i]+" ");
		}
		
		System.out.println(rev);
	}

}
