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
		Map<Integer, Integer> input = new HashMap<>();
		int max = 0;    // 최댓값을 담는 변수 max
		
		for (int i = 1; i <= 9; i++) {
			int num = scan.nextInt();
			// map은 키로 밸류를 조회하는 건 가능하지만, 역으로는 불가능하기 때문에 입력받는 숫자인 num을 key값에 넣어준다.
			// .put(K key, V value);
			// value값에는 i를 넣어줘서 입력받는 순서대로 번호를 받는다 
			input.put(num, i);   
			
			if (max < num) {   // 최댓값 구하는 로직
				max = 0;     // 새로 입력받는 숫자가 기존 최댓값보다 큰 경우에 max를 초기화 후
				max += num;  // 새로운 최댓값을 max에 삽입
			}
		}
		System.out.println(max);   // 최댓값 출력
		System.out.println(input.get(max));  // .get(key), 최댓값의 순번을 조회 후 출력
	}
}
