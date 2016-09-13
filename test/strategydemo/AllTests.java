package strategydemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestFlatRateDiscount.class, TestPercentageDiscount.class, TestRandomDiscount.class })
public class AllTests {

}
