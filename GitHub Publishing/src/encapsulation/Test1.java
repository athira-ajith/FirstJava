package encapsulation;

public class Test1 {
	private int a;
	private String b;
	
public void setter(String b,int a) {
	
	this.b=b;
	this.a=a;
	
	
}
public void getter() {
	
	System.out.println("name is"+b+"age is"+a);
	
}

}
