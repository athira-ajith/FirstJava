
public class Child extends Parent{
	public void subtract() {
		int sub=a-b;
		System.out.println(sub);
	}
	
	public static void main(String args[]) {
		Child ch=new Child();
		ch.add();
		ch.subtract();
	}

}
