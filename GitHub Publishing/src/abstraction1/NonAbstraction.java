package abstraction1;

public class NonAbstraction extends AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonAbstraction obj = new NonAbstraction();
		obj.print();
		AbstractExample.receive();
		
		 AbstractExample obj1=new NonAbstraction();
		 obj1.call();
		

	}
	
	public void print() {
		System.out.println("message");
		}

}
