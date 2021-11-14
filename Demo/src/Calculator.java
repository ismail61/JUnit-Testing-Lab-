
public class Calculator {
	public int add(int a,int b) {
		return a + b;
	}
	public int sub(int a,int b) {
		return a - b;
	}
	public int mul(int a,int b) {
		return a * b;
	}
	public float div(int a,int b) {
		return a / b;
	}
	public int[] arrayOneSum(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 1;
		}
		return arr;
	}
	public void Performance() {
		for (int i = 0; i < 1000000 ; i++) {
			
		}
		System.out.print("FINISH");
	}
}
