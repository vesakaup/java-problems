import java.io.PrintWriter;
import java.util.Scanner;

public class AdditionAndSubtraction {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x, y, z;
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        int result = -1;
        int nbr = 0;
        for (int i = 0; i <= 2000; i++) {
        	if (z == nbr) {
        		result = i;
        		break;
        	}
        	if (i%2 == 0) {
        		nbr = nbr + x;
        	}
        	else {
        		nbr = nbr -y;
        	}
        }
        
        
        out.println(result);

        in.close();
        out.close();
    }
}