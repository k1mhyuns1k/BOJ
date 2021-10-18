package BOJ;

import java.util.Scanner;

public class BOJ1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int checkNum = T;
		int addNum = 0;
		int newNum = 0;
		int cnt = 0;
		
		while(true) {
			addNum = (T / 10) + (T % 10);
			newNum = (T % 10) * 10 + (addNum % 10);
			cnt++;
			T = newNum;
			
			if(checkNum == newNum) break;
		}
		System.out.println(cnt);
	}
}
