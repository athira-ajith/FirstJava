package abstraction1;

public abstract class AbstractExample {
	
	public AbstractExample() {
		System.out.println("constructor");
		
	}
	
	public void call() {
		System.out.println("call instance");
	}
	
	public static void receive() {
		System.out.println("static method");
	}
	
	
	public abstract void print();
		
		
	}


