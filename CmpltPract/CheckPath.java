import java.io.File;

public class CheckPath {

	public static void main(String[] args) {
		
	File f = new File("C:\\Users\\ustest\\Desktop\\builds");
	
	if(f.exists()) {
		
		System.out.println("File exists");
	} 
	else {
		
		System.out.println("File does not exist");
	}
		

	}

}
