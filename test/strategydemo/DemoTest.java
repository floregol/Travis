package strategydemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class DemoTest {
	float testAmt;
	Order testOrder;
	static String testName;
	static float testPrice;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testName = "Jennifer";
		testPrice = 444.07f;		
	}

	@Before
	public void setUp() throws Exception {
		testOrder = new Order(testName, testPrice);
	}

	@Test
	public void testPercentDiscountStrategy() {
		testAmt = 10f;
		float expectedDiscount = testPrice - (testPrice/10);
		DiscountStrategy strategy = new PercentDiscountStrategy(testAmt);
		testOrder.setStrategy(strategy);
		Assert.assertEquals("unexpected name", testName, testOrder.getName());
		Assert.assertEquals("unexpected name", testPrice, testOrder.getPrice(), 0);
		Assert.assertEquals("unexpected name", expectedDiscount, testOrder.getDiscountedPrice(),0.01f);
	
	}
	@Test
	public void testRandomDiscountStrategy() {
		
		new RandomDiscountStrategy();
		
	}

}
