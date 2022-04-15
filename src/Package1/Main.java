package Package1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(st1.nextToken());
		}
		arr(X, arr);
		
		br.close();		
	}
	
	private static void arr(int X, int arr[]) {
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]<X) {
				System.out.println(arr[i]);
			}
		}
	}
}