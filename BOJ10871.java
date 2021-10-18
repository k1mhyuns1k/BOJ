package BOJ;

import java.util.Scanner;

public class BOJ10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		int[] k = new int[N];
		
		for(int i = 0; i < k.length; i++) {
			k[i] = scan.nextInt();
		}
		
		for(int i = 0; i < k.length; i++) {
			if(k[i] < X) {
				System.out.printf(k[i] + " ");
			}
		}
	}

}
