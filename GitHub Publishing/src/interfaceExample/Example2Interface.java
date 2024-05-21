package interfaceExample;

public class Example2Interface extends ExampleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2Interface obj = new Example2Interface();
		obj.add();

	}
	
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}

	

}
