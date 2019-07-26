// A class without a name and just for one time use
// used when the only purpose of a class is to override a method of another class

package CmpltPract;

class A {

	public void show() {
		System.out.println("In A show");
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		A obj = new A() {
			public void show() {
				System.out.println("Annonymous Show");
			}
		};

		obj.show();

	}

}
