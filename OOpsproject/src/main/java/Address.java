
public class Address {
	
	String addr;
	Student st;
	
	
	public Address(String addr, Student st) {
		this.addr=addr;
		this.st=st;	
	}
	public void print() {
		 System.out.println(st.rollno+" "+st.name);
		 System.out.println(addr);
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(1,"Athira");
		Address s2= new Address("kattanam",s1);
		s2.print();
		

	}

}
