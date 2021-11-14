package com.user.ismail;

public class TestingLab {
	
	public boolean batch17Check(String str) {
		if(str.equalsIgnoreCase("17 Batch")) return true;
		else return false;
	}
	
	public int countDigits(String str) {
        return (int)str.chars().filter(Character::isDigit).count();
    }
	
	public boolean arrayCheck(Class classz) {
		return classz.isArray();
	}
	
	/*
	public int[] arrayOneSum(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 1;
		}
		return arr;
	}
	
	public boolean batch17Check(int n) {
		if(n>0 && n<63) return true;
		else return false;
	}
	*/
	
}
