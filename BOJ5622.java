package BOJ;

import java.util.Scanner;

public class BOJ5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String dial = sc.next();
		
		char[] x = dial.toCharArray();
		int cnt = 0;
		
		for(int i = 0; i < x.length; i++) {
			if(x[i] >= 65 && x[i] <= 67) {
				cnt += 3;
			} else if(x[i] >= 68 && x[i] <= 70) {
				cnt += 4;
			} else if(x[i] >= 71 && x[i] <= 73) {
				cnt += 5;
			} else if(x[i] >= 74 && x[i] <= 76) {
				cnt += 6;
			} else if(x[i] >= 77 && x[i] <= 79) {
				cnt += 7;
			} else if(x[i] >= 80 && x[i] <= 83) {
				cnt += 8;
			} else if(x[i] >= 84 && x[i] <= 86) {
				cnt += 9;
			} else if(x[i] >= 87 && x[i] <= 90) {
				cnt += 10;
			}
		}
		
		System.out.println(cnt);
		
	}

}
