package loicalprogram;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		// print fibonacci series till nth no
		/* repeatation idenitfy
		 * formula next nup = sum of two previuos no
		 * first interation prevFirst = 0 , prevSecond = 1 , result = 1 
		 * second iterartion prevFirst 1, prevSecond = 1, result = 2 
		 * */
		
		int n = 15;
		/*
		 * /// multiple times code execution // 
		 * algoritham
		 * step 1 : - take nth no 15
		 * step 2 : initailize variable 
		 * step 3 : calculate next number
		 * step : print next no 
		 * step 4 : change previous nos ,
		 * step 5 : endp;
		 *   
		 */
		System.out.println("0, 1");
		int prevFirst = 0, prevSecond = 1,result = 0;
		for(int i=0;i<n;i++) {
			result = prevFirst + prevSecond;
			System.out.print(", "+result);
			/// print end  
			prevFirst = prevSecond;
			prevSecond = result;
			
		}
	}

}
