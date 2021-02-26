import java.io.PrintWriter;
import java.util.Scanner;

public class EraseMax {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n;
        n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i)
            a[i] = in.nextInt();

        int[] result = new int[n - 1];
        int max = a[0];
        int count = 0;
        int index = 0;

        for (int i=0; i<n;i++) {
        	if (a[i]>max) {
        		max = a[i];
        		count = 1;
        		index = i;
        	}
        
        	else if (a[i] == max){
        		count++;
        		if(count==3) {
        			index = i;
        		}
        	}
        }
        
        if(index !=0) {
        	out.print(a[0]);
        	out.print(" ");
        }

        for (int i = 1; i < n; ++i) {
            
            if (i!=index) {
            		out.print(a[i]);
            		out.print(" ");
            		

            
            }
            
        }
        out.println();

        in.close();
        out.close();
    }
}
