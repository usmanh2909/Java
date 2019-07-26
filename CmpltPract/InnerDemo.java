package CmpltPract;

class Outer{
	
	public void show() {
		
		System.out.println("In Show");
	}
	
	public class Inner{
		
		public void display() {
			System.out.println("In display");
			
		}
	}
	
}

public class InnerDemo {

	public static void main(String[] args) {
		Outer obj = new Outer();
		//obj.show();
		Outer.Inner obj1 = obj.new Inner();
		obj1.display();
	}

}
