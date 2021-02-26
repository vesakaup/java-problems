import java.util.*; 

import java.util.regex.*; 

 

public class Increment 

{ 

	public static void main(String args[]) 

	{ 

		Scanner sc = new Scanner(System.in); 

		String inp = sc.nextLine(); 

		int res =0; 

		if(Pattern.matches("[9]+",inp)) res = inp.length()+1; 

		else 

		res = inp.length(); 

	    System.out.println(res); 

	} 

}