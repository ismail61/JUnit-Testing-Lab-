package com.user.ismail;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

class TestingLabTest {
	TestingLab testing = new TestingLab();
	
	@BeforeAll
	static void Start() {
		System.out.println("--- Start Testing ---");
	}
	@AfterEach
	void CleanUp() {
		System.out.println("--- Clean Up ---");
	}
	/*
	@ParameterizedTest
	@DisplayName("17 Batch")
	@ValueSource(ints = {2,3,4,5,6})
	void Is17Batch(int n) {
		assertTrue(testing.batch17Check(n));
	}
	*/
	@ParameterizedTest
	@DisplayName("17 Batch")
	@ValueSource(strings = {"17 Batch","16 Batch","17 Batch"})
	void is17Batch(String str) {
		assertTrue(testing.batch17Check(str));
	}
	
	@ParameterizedTest
	@DisplayName("CSV File")
    @CsvFileSource(resources = "./sample.csv", numLinesToSkip = 1)
    void testLetterCountParametrized(String str, int cnt) {
        assertEquals(cnt, testing.countDigits(str));
    }
	
	@Test
	@DisplayName("Array Check")
	void arrayTest() {
		int[] arr = {2,7,3};
		String str = "Ismail";
		//int[] expected = {3,8,3};
		//assertArrayEquals(expected, testing.arrayOneSum(arr));
		assertTrue(testing.arrayCheck(arr.getClass()));
	}
}
