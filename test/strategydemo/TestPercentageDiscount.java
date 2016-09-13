package strategydemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPercentageDiscount {

	@Test
	public void testPercentDiscount1() {
		Order order = new Order("John", 200.24f);
		float discount = 10; 
		PercentDiscountStrategy strategy = new PercentDiscountStrategy(discount);
		order.setStrategy(strategy);
		assertEquals(180.22, order.getDiscountedPrice(), 0.00001);
	}

	@Test
	public void testPercentDiscount2() {
		Order order = new Order("John", 200.24f);
		float discount = 300; 
		PercentDiscountStrategy strategy = new PercentDiscountStrategy(discount);
		order.setStrategy(strategy);
		assertEquals(0, order.getDiscountedPrice(), 0.00001);
	}
	
	@Test
	public void testPercentDiscount3() {
		Order order = new Order("John", 200.24f);
		float discount = -10; 
		PercentDiscountStrategy strategy = new PercentDiscountStrategy(discount);
		order.setStrategy(strategy);
		assertEquals(200.24, order.getDiscountedPrice(), 0.00001);
	}
}
