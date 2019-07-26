package CmpltPract;

 abstract class Writer{
	public abstract void write();
	
}
class Pencil extends Writer{
	
	public void write() {
		System.out.println("I am pencil");
	}
}

class Pen extends Writer{
	
	public void write() {
		System.out.println("I am pen");
	}
}

class Kit{
	
	public void doSomething(Writer p)
	{
		p.write();
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		Kit k = new Kit();
		Writer p = new Pen();
		Writer pc = new Pencil();
		k.doSomething(p);
		

	}

}
