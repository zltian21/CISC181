

import org.junit.jupiter.api.Test;



class BuyCarTest {

	@Test
	void test() {
		BuyCar myCar = new BuyCar(35000, 0.1, 0, 60);
		System.out.println(myCar.monthlyPay());
		System.out.println(myCar.totalInterest());
	}

}
