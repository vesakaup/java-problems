
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;

public class StraightFlush {
	 public static void main(String[] arg) {
	        Scanner in = new Scanner(System.in);
	        PrintWriter out = new PrintWriter(System.out);
	        
	        String str = in.nextLine();
	    
	        String[] cards = str.split(" ");
	  
	        Set<String> suits =new HashSet<String>();
	        ArrayList<Integer> ranks = new ArrayList<>();
	        
	        for (int i =0; i<5;i++) {
	        	String card = cards[i];
	        	out.print(card);
	        	char r = card.charAt(0);
	        	int rank = toRank(r);
	        	ranks.add(rank);
	        	String suit = Character.toString(card.charAt(1));
	        	suits.add(suit);
	        	
	        }
	        
	        if (suits.size() >1) {
	        	System.out.println("NO");
	        	System.exit(0);
	        }
	        
	        Collections.sort(ranks);
	       
	        for (int i = 0; i < 4; ++i) {
	            if (ranks.get(i) + 1 != ranks.get(i + 1)) {
	                if (i < 3 || ranks.get(0) != 2 || ranks.get(4) != 14) {
	                	System.out.println("NO");
	                	System.exit(0);
	                }
	            }
	            
	        }
	        
	        System.out.println("YES");
	  
	 }
	 
	 public static int toRank(char c) {
		 String cd = Character.toString(c);
		 switch(cd){
		 case "T": return 10;
		 case "J": return 11;
		 case "Q": return 12;
		 case "K": return 13;
		 case "A": return 14;
			 
		 }
		 return Integer.parseInt(String.valueOf(c));
	 }
	        
}
