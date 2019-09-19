import java.util.Scanner;

public class lastwordLen {

	public int wordlength(String s) {
		
		String a = s.trim();
		int len=0;
        for(int i=0;i<=a.length()-1;i++) {
			
			if(a.charAt(i)==' ') {
				len=0;
			}
			else {
				len++;
			}
		}
        return len;
		
	}
	public static void main(String[] args) {
		//String s = "length of the last Word";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		lastwordLen l = new lastwordLen();
		//l.wordlength(s);
System.out.println("Lenghth of the last word= "+l.wordlength(s));
	}

}
