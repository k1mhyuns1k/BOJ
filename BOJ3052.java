package BOJ;

import java.util.Scanner;

public class BOJ3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10]; // 입력받을 10개의 숫자
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			num[i] = (sc.nextInt() % 42);
		}
		
		for(int i = 0; i < 10; i++) {
			int temp = 0;
			for(int j = i + 1; j < 10; j++) {
				if(num[i] == num[j]) temp++;
			}
			if(temp == 0) count++;
		}
		
		System.out.println(count);
		
	}

}
