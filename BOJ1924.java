package BOJ;

import java.util.Calendar;
import java.util.Scanner;

public class BOJ1924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(2007, A - 1, B);
		
		int C = cal.get(Calendar.DAY_OF_YEAR);

		switch(C % 7) {
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 0:
			System.out.println("SUN");
			break;
		}

	}

}
