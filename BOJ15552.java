package BOJ;

import java.io.*;
import java.util.*;

public class BOJ15552 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int TC = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < TC; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int sum = A + B;
			
			bw.write(sum + "\n");
		}
		bw.flush();
	}

}
