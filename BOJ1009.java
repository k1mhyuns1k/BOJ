package BOJ;

import java.util.Scanner;

public class BOJ1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i = 0; i < T; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = 1;
			
			for(int j = 1; j <= B; j++) {
				C *= A;
				C %= 10;
			}
			
			if(C == 0) {
				System.out.println(10);
			} else {
				System.out.println(C);
			}
		}
	}

}
