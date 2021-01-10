import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;

public class MyHealthDataTest2 {
	private static final double EPSILON = 0.1;
	/**
	 * 	This is a successful test for using assertEquals with the correct BMI=25.7 with 1 decimal place difference (EPSILON = 0.1)
	 */
	@Test
	public void successful_test() {
		MyHealthData test = new MyHealthData("Yicong", "Zhang", "Male", 74, 200, 1996, 2020);
		double BMI = test.getBMI();
		Assert.assertEquals(25.7, BMI, EPSILON);
	}
	/**
	 * This is a failure test for setting the wrong age=17 and using assertEquals compare to the result which is 24
	 */
	@Test
	public void failures_test() {
		MyHealthData test = new MyHealthData("Yicong", "Zhang", "Male", 74, 200, 1996, 2020);
		int age = test.getAge();
		assertEquals(17, age);
	}

}
