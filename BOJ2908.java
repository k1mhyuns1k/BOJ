package BOJ;

import java.util.Scanner;

public class BOJ2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[2];
		
		for(int i = 0; i < 2; i++) {
			arr[i] = sc.nextInt();
			int k = arr[i];
			
			int a = k / 100;
			int b = (k % 100) / 10;
			int c = (k % 100) % 10;
			
			arr[i] = (c * 100) + (b * 10) + a;
		}
		
		if(arr[0] > arr[1]) {
			System.out.println(arr[0]);
		} else {
			System.out.println(arr[1]);
		}
		
		
	}

}
