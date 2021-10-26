package BOJ;

import java.util.Scanner;

public class BOJ1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[26]; // 대소문자 구분을 하지않음. 알파벳을 받아주는 배열
		
		int mnum = 0; // 가장 많이 나온 횟수를 0으로 초기화.
		char result = 0; // 결과값
		
		String TC = sc.nextLine(); // 단어를 받아줌
		TC = TC.toUpperCase(); // 받은 단어를 모두 대문자로 변환.
		
		for(int i = 0; i < TC.length(); i++) {
			int a = TC.charAt(i) - 65; // A의 아스키코드는 65이므로 아스키코드 변환 후 빼줌.
			arr[a]++;
		}
		
		int max = arr[0]; // 횟수가 가장 많이 나온 알파벳을 A로 초기화 해줌.
		
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) { // A와 B부터 비교 시작. 
				max = arr[i];
				mnum = i;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(max == arr[i] && mnum != i) {
				result = '?';
				break;
			} else {
				result = (char)(mnum+65);
			}
		}
		
		System.out.println(result);
		
		
	}

}
