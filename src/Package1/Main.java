package Package1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int count=1; count<=T; count++) {
			
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			pw.printf("Case #%d: " + (A+B), count);
			pw.print("\n");
			
		}
		
		br.close();
		pw.flush();
		pw.close();
		
	}
}