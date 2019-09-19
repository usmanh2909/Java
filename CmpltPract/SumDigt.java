
public class SumDigt {
	
	public static int strsum(String s1) {
		
		int i,sum =0;
		for(i=0;i<s1.length();i++)
		 {
			 if(Character.isDigit(s1.charAt(i))) {
				 
				 String t=s1.substring(i,i+1);
				 sum+=Integer.parseInt(t);
			 }
			
		} return sum;
	}
	public static void main(String[] args) {
		String s ="sg8e34gdt5";
		System.out.println("sum="+strsum(s));

	}

}
