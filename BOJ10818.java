package BOJ;

import java.util.Scanner;

public class BOJ10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] a = new int[N];
		
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}
		
		int MAX = a[0];
		int MIN = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if(a[i] < MIN) {
				MIN = a[i];
			}
			if(a[i] > MAX) {
				MAX = a[i];
			}
		}
		
		System.out.println(MIN + " " + MAX);
	}

}
