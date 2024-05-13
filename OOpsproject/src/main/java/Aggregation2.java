
public class Aggregation2 {
	
	int b;	
	Aggregation1 agr;
	
	
 public Aggregation2(int b,Aggregation1 agr){
		
		this.b=b;
		this.agr=agr;
	}
 
 public void print() {
	 System.out.println(agr.a+""+agr.n);
	 System.out.println(b);
	 
 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aggregation1 ag1=new Aggregation1(1,"Athira");
		Aggregation2 ag2= new Aggregation2(0,ag1);
		ag2.print();

		
	

	}

}
