package Collections;

import java.util.ArrayList;

public class Uniqueno {

	public static void main(String[] args) {
		
		int a[] = {4,3,3,4,6,4,3,8,8,8};
		int b=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) 
		{
			int k=0;
			
			if(!al.contains(a[i])) 
			{
				
				al.add(a[i]);
				k++;
			
			for(int j=i+1;j<a.length;j++) 
			{
				
				if(a[i]==a[j]) 
				{
					k++;
				}
				
				
			}
			System.out.println(a[i]);
			System.out.println(k);
			}
			
			if(k==1) {
				
				b=a[i];

		}
		
		}System.out.println("unique number is "+ b);

}}
