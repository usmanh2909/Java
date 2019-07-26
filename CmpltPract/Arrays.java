package CmpltPract;

public class Arrays {

	public static void main(String[] args) {
		//int a[] ={4,8,4,9};
		
		int d[][]= {
				{1,3,5,6},
				{7,2,3},
				{1,2,3,4}
		};
		
		for(int i=0;i<d.length;i++) {
			
			for(int j=0;j<d[i].length;j++) {
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}
		

	}

}
