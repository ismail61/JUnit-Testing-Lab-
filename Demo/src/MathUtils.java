

public class MathUtils {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public String name(String a) {
		return a;
	}
	public boolean isEvenNumber(int n) {
		if(n%2==0) return true;
		else return false;
	}
	public static long countLetters(String value) {
        if (value == null) {
            return 0;
        }
        return value.chars().filter(Character::isLetter).count();
    }
}
