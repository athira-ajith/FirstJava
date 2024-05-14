package oops;

public class Addition2 extends Addition {

	public Addition2(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
	public boolean divsibilityChecker() {
		int result=add();
		return result%10==0;
		
	}
	
	public static void main(String args[]) {
		Addition2 divisiblebyTen= new Addition2(10,30);
		
		if (divisiblebyTen.divsibilityChecker()) {
            System.out.println("The addition result is divisible by 10.");
        } else {
            System.out.println("The addition result is not divisible by 10.");
		
	}

	}}
