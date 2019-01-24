package programming;

public class Reverse_Words_String {

	public static void main(String[] args) {

		String str = "Ankit Narang Is My Name";
		String a[] = str.split(" ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println(" ");
		//System.out.println(a.length);
		System.out.println(" ");
		
     for(int i=a.length-1;i>=0;i--) {
    	 System.out.print(a[i]+" ");
     }
	}

}
