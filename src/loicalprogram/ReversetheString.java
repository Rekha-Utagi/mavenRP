package loicalprogram;

import java.util.Scanner;

public class ReversetheString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Original String");
		String orignalstring = sc.next();
		String ReverseString = " ";
		for(int i=orignalstring.length()-1;i>=0;i--) {
			ReverseString=ReverseString+orignalstring.charAt(i);
		}
			System.out.println("Orignal String is "+orignalstring);
			System.out.println("Revere String is "+ReverseString);
			
		}
	}


