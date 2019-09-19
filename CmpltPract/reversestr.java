
public class reversestr {

	public static void main(String[] args) {
		
		String str = "color";
		String t ="";
		for(int i=str.length()-1;i>=0;i--)
		{
			
		 t += str.charAt(i);
		}
		System.out.println(t);
		
		if(str.equals(t)) {
			
			System.out.println("its palindrome");
		}
		else
		{
			System.out.println("Nope");
		}
	}

}
