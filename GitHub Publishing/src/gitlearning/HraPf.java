package gitlearning;

public class HraPf extends InputSalary{
	
	protected double hra;
	protected double pf;

	public HraPf(double basicPay, double deduction, double bonus) {
		super(basicPay, deduction, bonus);
		// TODO Auto-generated constructor stub
		calculateHRA();
		calculatePF();
	}
	
	private void calculateHRA() {
		this.hra=0.05 * basicPay; 
    }
	private void calculatePF() {
		this.pf=0.2 * basicPay; 
		
	}
}


