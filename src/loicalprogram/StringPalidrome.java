package loicalprogram;

import java.util.Scanner;

public class StringPalidrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("please enter String to check ...");
		String orgString = sc.next();
		String revString = "";
		System.out.println("Enter String "+orgString);
		for(int i=orgString.length()-1;i>=0;i--) {
			revString=revString +orgString.charAt(i);
			
		}
		System.out.println(revString);
		if(orgString.equals(revString)) {
			System.out.println("Yes this is palindrome");
		}
		else {
			System.out.println("this is not palindrome");
		}
		
	}

}
