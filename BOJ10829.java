package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ10829 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //10진수 받기
		long T = Long.parseLong(br.readLine());
		
		List<Long> result = new ArrayList<Long>();
		
		while(T != 1) {
			result.add((long) T % 2);
			T /= 2;
		}
		result.add((long) 1);
		Collections.reverse(result);
		
		for(int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i));
		}
	}

}
