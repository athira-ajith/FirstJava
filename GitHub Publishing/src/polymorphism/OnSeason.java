package polymorphism;

public class OnSeason {
	
	public double billAmount;

    public OnSeason(double billAmount) {
        this.billAmount = billAmount;
    }
    
    public double calculateDiscount() {
        return billAmount * 0.4; // 40% discount during on-season
    }

}
