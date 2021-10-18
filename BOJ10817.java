package BOJ;

import java.util.Scanner;

public class BOJ10817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int MAX = 0;
		int MIN = 0;
		
		if(A >= B) {
			MAX = A;
			MIN = B;
		} else {
			MAX = B;
			MIN = A;
		}
		
		if(MAX >= C) {
			if(MIN >= C) {
				System.out.println(MIN);
			} else {
				System.out.println(C);
			}
		} else {
			System.out.println(MAX);
		}

	}

}
