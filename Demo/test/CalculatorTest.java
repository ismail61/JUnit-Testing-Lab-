import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator calculator = new Calculator();
		//assertEquals(7,calculator.add(2, 5));
		//assertEquals(2,calculator.sub(5,3));
		//assertEquals(10,calculator.mul(2, 5));
		//assertEquals(7.0,calculator.div(14,2));
		Exception exception = assertThrows(ArithmeticException.class, () ->{
			 calculator.div(2,0);
		});
		System.out.print(exception.getMessage());
	}
	
	@Test
	void arrayTest() {
		Calculator calculator = new Calculator();
		int[] arr = {2,7,3};
		int[] expected = {3,8,3};
		//assertArrayEquals(expected, calculator.arrayOneSum(arr));
	}
	
	/*
	@Test
	void timeoutNotExceeded() 
	{
	    //The following assertion succeeds.
	    assertTimeout(ofMillis(10), () -> {
			Calculator calculator = new Calculator();
			calculator.Performance();
		});
	}
	*/

}
