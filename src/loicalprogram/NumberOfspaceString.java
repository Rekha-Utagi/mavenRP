package loicalprogram;

public class NumberOfspaceString {

	public static void main(String[] args) {

		String name ="P U N E ";
		int Counter =0;
		for (int i=0;i<=name.length()-1;i++) 
		{
			char myChar = name.charAt(i);
			if(myChar==' ')
			{
			 Counter++;	
				
			}
		}
		System.out.println("Number of white spaces are "+Counter );

	}

}
