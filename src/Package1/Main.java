package Package1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.StringTokenizer;
import java.io.IOException;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
//		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		for(int i=1; i<=n; i++) {
			for(int t=n-1; t>=i; t--) {
				pw.write(" ");
			}
			for(int j=1; j<=i; j++) {				
				pw.write("*");				
			}			
			pw.write("\n");
		}
		
		br.close();
		pw.flush();
		pw.close();
		
	}
}