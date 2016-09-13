package strategydemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRandomDiscount {

	@Test
	public void testRandomDiscount() {
		Order order = new Order("John", 200.24f);
		RandomDiscountStrategy strategy = new RandomDiscountStrategy();
		order.setStrategy(strategy);
		float result = order.getDiscountedPrice();
		if (!(result >= 0 && result <= 200.24)) {
			fail("Result not in [0,200] range: " + result);
		}
	}
	
	@Test
	public void testNullDiscount() {
		Order order = new Order("John", 200.24f);
		float result = order.getDiscountedPrice();
		assertEquals(200.24, result, 0.00001);
	}
}
