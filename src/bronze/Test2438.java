package bronze;

import java.util.Scanner;

public class Test2438 {
	
	public static void main(String[] args) {
		
		// 별 찍기 1번
		// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
