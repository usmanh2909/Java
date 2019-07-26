package CmpltPract;

interface Abc{
	
	void show();
}

class Implimenter implements Abc{

	@Override
	public void show() {
		System.out.println("Show method");
		
	}
	
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
		Abc a = new Implimenter();//creating the object of class and the refernce of interface
		a.show();
	}

}
