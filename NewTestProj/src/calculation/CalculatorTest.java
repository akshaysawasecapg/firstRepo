package calculation;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

	@Test
	public void testSubstract() {
		Calculator obj = new Calculator();
		int expected = 15;
		int acutal = obj.substract(25,10);
		Assertions.assertEquals(expected, acutal);
	}

	@Test
	public void testDivide() {
		Calculator obj = new Calculator();
		int expected = 5;
		int actual = obj.divide(25, 9);
		Assertions.assertEquals(expected, actual);
	}

}
