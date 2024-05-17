package finall;

public class Finalexample {
	
	final int a=10;
//value of final variable can be changed using constructor
	//public  {
		//a=10;
		
	public final void print() {
		System.out.println("final");
	}
	public static void main(String[]args) {
		
		Finalexample obj = new Finalexample();
		System.out.println(obj.a);
		obj.print();
		
	
		
	}

}
