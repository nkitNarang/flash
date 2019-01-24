package programming;

public class PrintAscii {

	public static void main(String[] args) {
		// 7 bits
		// range _ 2**7=128
		// 0-127
        // American Standard code For information intercahange
		for (int i = 0; i <= 127; i++) 
		{
			System.out.printf("%d : %c \n ", i, i);
		}
	}

}
