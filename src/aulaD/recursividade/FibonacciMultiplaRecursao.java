package aulaD.recursividade;

public class FibonacciMultiplaRecursao {

	public static int fibonacci(int n) {
		if (n < 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(6));
	}
}
