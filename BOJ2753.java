package BOJ;

import java.util.Scanner;

public class BOJ2753 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 4로 나누어 떨어지면 윤년, 
		// 2. 100으로 나누어 떨어지면 윤년이 아님, 
		// 3. 400으로 나누어 떨어지면 윤
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();

		boolean leapYear = (A % 4 == 0) && 
				(A % 100 != 0) || (A % 400 == 0);
		
		if(leapYear == true) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
