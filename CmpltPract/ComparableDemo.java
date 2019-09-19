package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Stud implements Comparable<Stud> {
	int rollno,marks;
	String name;
	
	public Stud(int rollno, String name, int marks) {
		
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString() {
		
		return"Stud [rollno="+rollno+",name="+name+",marks="+marks+"]";
	}


	public int compareTo(Stud s) {
		
		return name.length()>s.name.length()?1:-1;
	}
	
}
public class ComparableDemo {

	public static void main(String[] args)
	{
		List<Stud> studs = new ArrayList<>();
		
		studs.add(new Stud(23,"Mahesh",55));
		studs.add(new Stud(27,"Ramesh",76));
		studs.add(new Stud(25,"Kiran",87));
		studs.add(new Stud(33,"Ajay",66));
		
		Collections.sort(studs);
		
		for(Stud s : studs) {
			
			System.out.println(s);
		}
	}
	
	 
}
