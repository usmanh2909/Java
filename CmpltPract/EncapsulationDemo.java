package CmpltPract;

class Student{
	private int rollnum;
	private String name;
	
	public void setRollno(int r) {
		
		this.rollnum=r;
	}
	
	public int getRollno() {
		return rollnum;
	}
public void setName(String name) {
		
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("Ramesh");
		s.setRollno(5);
		 System.out.println(s.getRollno());
		 System.out.println(s.getName());
		
	}

}
