package calculation;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTestCase {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void sub(){
		Calculator obj = new Calculator();
		int expected = 15;
		int acutal = obj.substract(25,10);
		Assertions.assertEquals(expected, acutal);
	}

	@Test
	public void div(){
		Calculator obj = new Calculator();
		int expected = 5;
		int actual = obj.divide(25, 5);
		Assertions.assertEquals(expected, actual);
	}
	
	
	
}
