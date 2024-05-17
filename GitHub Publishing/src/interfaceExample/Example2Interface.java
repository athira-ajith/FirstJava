package interfaceExample;

public class Example2Interface implements ExampleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2Interface obj = new Example2Interface();
		obj.add();

	}
	
	public void add() {
		int sum=a+b;
		System.out.println(sum);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
