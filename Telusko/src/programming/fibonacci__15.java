package programming;

public class fibonacci__15 {

	public static void main(String[] args) {
		int term = 15;
		int result = 0;
		int a = 0;
		int b = 1;

		System.out.print(a + " " + b + " ");

		for (int i = 1; i <= term -2; i++) {
			result = a + b;
			
			a = b;
			b = result;
			System.out.print(result+" ");
			

		}

	}
}