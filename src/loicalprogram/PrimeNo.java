package loicalprogram;

import java.util.Scanner;

public class PrimeNo {

	/* algoritham
	 * no 17 
	 *  step : 1 
	 *  step : 2 
	 *  step : 3 
	 *  no divisiable by i... 
	 *  if declared no is divided by decalred = zero then its prime no else increment
	 *  
	 *  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter valid no");
		Integer no = sc.nextInt();
		if(checkPrimeNo(no)) {
			System.out.println("This is prime number");
		} else {
			System.out.println("This is not prime number");
		}
		
	}
	public static boolean checkPrimeNo(int no) {
		boolean isPrime = false;
		int i=0;
		for(i= 2; i <=no;i++ ) {
			if(no%i == 0 ) {
				break;
			} 
		 }
		 if(i == no) {
			 isPrime = true;
		 } else {	 
			 isPrime =false;
		 }		 
		 return isPrime;
	}

}
