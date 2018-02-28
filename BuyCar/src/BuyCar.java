

public class BuyCar {
	private int carCost;
	private double interestRate;
	private int downPay;
	private int lengthOfMonth;
	
	public BuyCar(int para1, double para2, int para3, int para4) {
		
		carCost = para1;
		interestRate = para2;
		downPay = para3;
		lengthOfMonth = para4;	
	}
	
	
	
	
	public double monthlyPay() {
		
		double monthInterestRate = interestRate/12;
		int carPayWithLoan = carCost - downPay;
		double value1 = carPayWithLoan * monthInterestRate;
		double value2 = 1 + monthInterestRate;
		double value3 = 1-(1/(Math.pow(value2, lengthOfMonth)));
		double monthlyPayResult = value1/value3;
		return Math.round(monthlyPayResult*100.0)/100.0;
		
		
	}
	
	public String totalInterest() {
		double totalInterestResult = monthlyPay()*lengthOfMonth-(carCost-downPay);
		String StrInterestResult = String.format ("%.2f", totalInterestResult);
		return StrInterestResult;
		
		
		
	}
	
	public static void main(String[] args) {
		
		BuyCar myCar = new BuyCar(35000, 0.1, 0, 60);
		System.out.println(myCar.totalInterest());
		
	}

}
