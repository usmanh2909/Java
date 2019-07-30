package CmpltPract;
								//Part 1
//class Hi extends Thread{
//	
//	public void run() {                //Override run() in thread for the execution
//		for(int i=0;i<5;i++) {
//		System.out.println("Hi");
//		try { Thread.sleep(100);}catch(Exception e) {};
//	}}
//}
//
//class Hello extends Thread{
//	public void run() {     
//		for(int i=0;i<5;i++) {
//		System.out.println("Hello");
//		try { Thread.sleep(100);}catch(Exception e) {};
//	}}
//}						

							//Part 2
				//** Because of using Thread class our class cannot extend any other class
					// To overcome this we can implement Runnable interface
class Hi implements Runnable{
	
	public void run() {                //Override run() in thread for the execution
		for(int i=0;i<5;i++) {
		System.out.println("Hi");
		try { Thread.sleep(1000);}catch(Exception e) {};
	}}
}

class Hello implements Runnable{
	public void run() {     
		for(int i=0;i<5;i++) {
		System.out.println("Hello");
		try { Thread.sleep(1000);}catch(Exception e) {};
	}}
}
							//use anonymous class, Lamda expression, make the code as much shorter as you can
public class ThreadDemo {

	public static void main(String[] args) {
		 Hi obj1 = new Hi();
		 Hello obj2 = new Hello();
		 
//		 obj1.start();  
//		try { Thread.sleep(100);}catch(Exception e) {};// so that there is gap between both the threads
//		 obj2.start();
		 
		 //// Runnable just has onluy one method which is run there is no start method in it
		 				//Hence
		 Thread t1 = new Thread(obj1); // Create object of Thread & pass the object of runnable
		 Thread t2 = new Thread(obj2);		
		 
		 t1.start();  // Now use Thread methods 
		 try { Thread.sleep(10);}catch(Exception e) {};
		 t2.start();
	}

}
