package BOJ;

import java.util.Scanner;

public class BOJ10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 1;
		
		if(N == 0) {
			System.out.println(1);
		} else {
			for(int i = 1; i <= N; i++) {
				num *= i;
			}
			System.out.println(num);
		}
	}

}
