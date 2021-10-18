package BOJ;

import java.util.Scanner;

public class BOJ2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int[] a = new int[9];
		
		for(int i = 0; i < 9; i++) {
			a[i] = scan.nextInt();
		}
		
		int MAX = a[0];
		int MAXnum = 0;
		
		for(int i = 1; i < a.length; i++) {
			if(a[i] > MAX) {
				MAX = a[i];
				MAXnum = i;
			}
		}
		
		System.out.println(MAX);
		System.out.println(MAXnum + 1);
	}

}
