
import java.util.Scanner;

public class StringContains {

	public void contain(String s1, String s2){
		
        if (s2.contains(s1)) {
			
			System.out.println("String "+s2+" contains "+s1);
		}
		
		else {
			
			System.out.println("String "+s2+" does not contain "+s1);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter Two strings");
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		
		StringContains s = new StringContains();
		s.contain(s1, s2);

	}

}
