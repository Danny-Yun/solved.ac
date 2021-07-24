package bronze;

import java.util.Scanner;

public class Test5522 {
	
	public static void main(String[] args) {
		 
		// Danny군은 카드 게임을 하고 있다. 이 카드 게임은 5회의 게임으로 진행되며, 그 총점으로 승부를 하는 게임이다.
		// Danny군의 각 게임의 득점을 나타내는 정수가 주어졌을 때, Danny군의 총점을 구하는 프로그램을 작성하라.
		
		Scanner scan = new Scanner(System.in);   
		
		int sum = 0;      // 총점을 담는 변수 sum
		
		for (int i = 0; i < 5; i++) {    // 반복문을 통해 5회 실행   
			int score = scan.nextInt();    // 입력받는 점수 score, 새로 입력받을 때마다 초기화
			sum += score;        // 입력받은 점수를 sum에 담기
		}
		System.out.println(sum);   // 총점 출력
	}
}
