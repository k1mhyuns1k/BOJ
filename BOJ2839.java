package BOJ;

import java.util.Scanner;

public class BOJ2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int A = 0;
		int B = 0;
		
		while((N % 5) != 0 && N > 0) {
			N = N - 3;
			B++;
		}
		
		if(N < 0) {
			System.out.println("-1");
		} else {
			A = N / 5;
			System.out.println(A + B);
		}
	}

}
