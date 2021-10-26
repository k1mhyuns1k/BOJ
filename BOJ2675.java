package BOJ;

import java.util.Scanner;

public class BOJ2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		
		int[] R = new int[TC];
		String[] S = new String[TC];
		
		for(int i = 0; i < TC; i++) {
			R[i] = sc.nextInt();
			S[i] = sc.next();
		}
		
		for(int i = 0; i < TC; i++) {
			for(int j = 0; j < S[i].length(); j++) {
				for(int k = 0; k < R[i]; k++) {
					System.out.print(S[i].charAt(j));
				}
			}
			System.out.println();
		}
	}

}
