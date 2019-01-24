package programming;

public class PrimeOrNot {

	public static void main(String[] args) {
		// Those number which are divisible by itself and 1 
		int num = 5;
		boolean isPrime = true;

		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime)
			System.out.println(num + "- is prime Number");
		else
			System.out.println(num + " - is not Prime Number");
	}

}
