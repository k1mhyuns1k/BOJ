package BOJ;

import java.util.Scanner;

public class BOJ2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i = 1; i <= T; i++) {
			for(int j = T; j >= 1; j--) {
				if(j > i) {
					System.out.printf(" ");
				} else {
					System.out.printf("*");
				}
			}
			System.out.println();
		}
	}

}
