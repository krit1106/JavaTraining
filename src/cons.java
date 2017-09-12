
public class cons {

	public cons() {
		System.out.println("This is the default constructor");
	}
	
	public cons(int age, String name){
		System.out.println("This is parameterized constructor");
		System.out.println("I am " + name + " and my age is " + age + " years");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cons c = new cons();
		cons c1 = new cons(23, "Kritika");
	}

}
