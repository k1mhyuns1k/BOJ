package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 과목의 수
		
		double[] arr = new double[n]; //과목별 점수
		double sum = 0; //조작된 점수의 합
	
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		Arrays.sort(arr); // 배열 정렬을 통해 최대값은 arr[arr.length-1]에 들어가게 됨.
		
		for(int i = 0; i < n; i++) {
			arr[i] = (double)(arr[i] / arr[arr.length - 1]) * 100;
			sum += arr[i];
		}
		
		System.out.println(sum / n);
	}

}
