package loicalprogram;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* swap 
		 * a = 10, b = 20
		 * a = 20, b = 10;
		 * 
		 * 
		 * */
		int a = 110, b = 520;//, c = 0;
		/*
		 * c = b; b = a ; a = c;
		 */
		a = a + b ; // a = 630 , b = 520
		b = a - b; // b = 110, a = 630
		a = a - b;
		System.out.println(" a = " + a + ", b  = " + b);
		
	}

}
