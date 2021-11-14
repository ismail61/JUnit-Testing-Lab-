

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.user.ismail.MathUtils;

class MathUtilsTest {
	MathUtils mathUtils;
	/*
	@BeforeAll
	static void Start() {
		// System.out.println("--- Start Testing ---");
	}

	@AfterAll
	static void Stop() {
		// System.out.println("--- Stop Testing ---");
	}
	*/

	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}

	@AfterEach
	void CleanUp() {
		// System.out.println("--- Clean Up ---");
	}

	@Nested
	@DisplayName("Testing add Method")
	class testAdd {
		@Test
		@DisplayName("Positive Sum")
		void positiveAdd() {
			assertEquals(2, mathUtils.add(1, 1));
		}

		@Test
		@DisplayName("Negative Sum")
		void negativeAdd() {
			assertEquals(-1, mathUtils.add(1, -2));
		}
	}

	@Test
	void testSub() {
		assertEquals(2, mathUtils.subtract(3, 1));
	}

	@Test
	@DisplayName("Multiplication")
	void testMultiply() {
		// nested test
		
		assertAll(
				
				() -> assertEquals(4, mathUtils.multiply(2, 2), "Should be Positive"),
				() -> assertEquals(-8, mathUtils.multiply(8, -1), "Should be Negative"),
				() -> assertEquals(0, mathUtils.multiply(2, 0), "Should be Zero")

		);
	}

	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> {
			mathUtils.divide(1, 0);
		}, "divide by zero throws exception");
	}

	@Test
	@DisplayName("Assumptions")
	void Assume() {
		// assumeTrue(5<4);
		String someString = "Just a string";
		assumingThat(someString.equals("Just a sting"), () -> assertEquals(0, 0));
	}

	@Test
	@DisplayName("Only for MAC")
	@EnabledOnOs(value = OS.WINDOWS , disabledReason = "enable only on WINDOWS OS")
	void MAC() {
		//System.out.println("Only for WINDOWS");
	}
	@Test
	@Disabled("Fail Test Case")
	@DisplayName("Should be Failed")
	void failDisabled() {
		fail("Fail");
	}
	 
	@ParameterizedTest
	@ValueSource(strings = {"Ismal","Ismail"})
	void testAddWithParameters(String val) {
		assertEquals("Ismail", mathUtils.name(val));
	}
	
	@ParameterizedTest
	@DisplayName("Is Even Test Case")
	@ValueSource(ints = {2,3,4,5,6})
	void IsEvenTest(int n) {
		assertTrue(mathUtils.isEvenNumber(n));
	}
	
	@ParameterizedTest
	@MethodSource("stringProvider")
	void methodSourceTest(String s) {
		assertNotNull(s);
	}
	public static Stream<String> stringProvider(){
		return Stream.of("ismail","hosen");
	}
	
	@ParameterizedTest
	@EnumSource(value = Month.class,names = {"APRIL","AUGUST","SEPTEMBER"})
	void someMonths_Are30DaysLong(Month month) {
		final boolean leapYear = false;
		assertEquals(30, month.length(leapYear));
	}
	@ParameterizedTest
    @CsvFileSource(resources = "/financial.csv", numLinesToSkip = 1)
    public void testLetterCountParametrized(String value, long letterCount) {
        assertEquals(letterCount, mathUtils.countLetters(value));
    }

}
