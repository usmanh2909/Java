
public class Zero {
	
	public static void order(int a[]){
		int j=0;
		for(int i=0; i<a.length;i++) {
			
			if (a[i]!=0) {
				
				a[j++] = a[i];
			}
		}
		
		while(j<a.length) {
			
			a[j++]=0;
		}
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);

	}
	} 
	
	
	
	

	public static void main(String[] args) {
		int arr[] = {5,0,8,0,6,3,0,0,7,0};
		order(arr);
		
}}