import java.util.Scanner;

public class TotalSalary extends HraPf {
	
	public TotalSalary(double basicPay, double deduction, double bonus) {
		super(basicPay, deduction, bonus);
		// TODO Auto-generated constructor stub
	}
	
	 public double calculateTotalSalary() {
	        double totalSalary = basicPay+bonus-deduction+hra-pf;
	        return totalSalary;
	    }
	

	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Basic Salary of the Employee:");
		double basicPay = sc.nextDouble();
		System.out.print("Enter deduction of the Employee:");
		double deduction = sc.nextDouble();
		System.out.print("Enter bonus of the Employee:");
		double bonus = sc.nextDouble();
		
		TotalSalary employee = new TotalSalary(basicPay, deduction, bonus);
        double totalSalary = employee.calculateTotalSalary();

        System.out.println("Total salary of the employee: " + totalSalary);
		
		}

}
