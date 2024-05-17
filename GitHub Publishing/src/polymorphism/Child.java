package polymorphism;

public class Child extends Parent{
	
public void Method1(){
		super.Method1();
		System.out.println("Polymorphism: is a relationship");
		
	}

public static void main(String args[]) {
	
	Child obj=new Child();
	obj.Method1();
}

}
