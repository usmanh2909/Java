
public class Seclar {
	
	
	
	public static int secnd(int arr[]){
		int temp=0;
	for(int i=0;i<arr.length;i++) {
		
		for(int j=0;j<arr.length;j++) {
			
			if(arr[i]<arr[j]) {
				
				temp = arr[i];
				arr[i]= arr[j];
				arr[j] = temp;
			}
		}
	}  return arr[arr.length-2];
	}
	
	
	public static void main(String[] args) {
		int a[] = {5,3,7,9,6,8};
		System.out.println(secnd(a));
		
	}

}
