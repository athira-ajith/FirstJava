package polymorphism;

public class OffSeason extends OnSeason {
	
	public OffSeason(double billAmount) {
		super(billAmount);
		// TODO Auto-generated constructor stub
	}

	public double calculateDiscount() {
		
		super.calculateDiscount();
        return billAmount * 0.15; // 15% discount during off-season
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OffSeason Customer = new OffSeason(1000);
  

        System.out.println("Discount for on-season customer: " + Customer.calculateDiscount());
        System.out.println("Discount for off-season customer: " + Customer.calculateDiscount());
    }

	}


