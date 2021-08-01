package bronze;

import java.util.*;

public class Test2562 {
	
	public static void main(String[] args) {
		
		/* 최댓값 구하기
		 * 
		 * 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고, 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성
		 * 예를 들어, 서로 다른 9개의 자연수
		 * 3, 29, 38, 12, 57, 74, 40, 85, 61
		 * 을 입력하면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다. 
		 */
		Scanner scan = new Scanner(System.in);
		List<Integer> input = new ArrayList<>();
		int max = 0;
		
		for (int i = 0; i < 9; i++) {
			int num = scan.nextInt();
			input.add(num);
			
			if (max < num) {
				max = 0;
				max += num;
			}
		}
		System.out.println(max);
		System.out.println(input);
	}
}
