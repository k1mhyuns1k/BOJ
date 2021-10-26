package BOJ;

import java.util.Scanner;

public class BOJ4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		
		for(int i = 0; i < C; i++) {
			int n = sc.nextInt();
			int cnt = 0;
			double sum = 0;

			double[] score = new double[n];
			
			for(int j = 0; j < n; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			
			double avg = sum / n;
			
			for(int k = 0; k < n; k++) {
				if(score[k] > avg) {
					cnt++;
				}
			}
			
			double k = ((double)cnt / (double)n) * 100;
			String num = String.format("%.3f", k);
			System.out.println(num + "%");
			
		}
	}

}
