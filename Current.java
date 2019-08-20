package Session3.assignment5.bankAccount;

public class Current extends bankAccount{

	private double rateOfInt;
	
	public Current(int no, String name, String bal) {
		super(no, name, bal);
		// TODO Auto-generated constructor stub
	}

	public double getRateOfInt() {
		return rateOfInt;
	}

	public void setRateOfInt(double rateOfInt) {
		this.rateOfInt = rateOfInt;
	}
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	}
}
