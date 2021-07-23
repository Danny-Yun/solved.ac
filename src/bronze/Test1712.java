package bronze;

import java.util.Scanner;

public class Test1712 {
	
	public static void main(String[] args) {
		
		/* 월드전자는 노트북을 제조하고 판매하는 회사다. 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 든다. 
		 * 한 대의 노트북을 생산하는 것에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다. 예를 들어 A = 1000, B = 70이라고 한다면,
		 * 이 경우 노트북 1대 생산에 총 1070만원이 들며, 10대 생산에는 총 1700만이 드는 격이다. 노트북의 가격은 C만원으로 책정한다. 
		 * 
		 * 일반적으로 생산 대수를 늘리다 보면, 어느 순간 총 수입(판매비용)이 총 비용(고정비용+가변비용)보다 많아지게 된다. 
		 * 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 이 지점을 손익분기점(Break-Even Point)이라고 한다. 
		 * A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 만들어보자.
		 * 
		 * +)
		 * 첫 번째 줄에 손익분기점 즉 최초로 이익이 발생하는 판매량을 출력한다. 
		 * 손익분기점이 존재하지 않으면 -1을 출력한다.
		 */
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();    // 고정 비용
		int b = scan.nextInt();    // 가변 비용
		int c = scan.nextInt();    // 노트북의 가격
		
		long cost = 0;      // 총 비용 (고정비용+가변비용)
		long income = 0;    // 총 수익 (매출)
		long bep = 0;       // 손익분기점 (최초로 이익이 발생하는 판매갯수 세는 변수)
		
		if(b >= c) {      // 가변비용(노트북을 만드는데 필요한 비용)이 노트북 판매 가격보다 비쌀 경우
			bep = -1;     // 손익분기점이 존재할 수 없음 -> 손익분기점 -1로 고정 
			System.out.println(bep);
			
		} else {			// 판매가격이 더 높아서 이익이 발생하는 경우
			cost += a;       // 총 비용에 고정비용을 먼저 삽입
			
			while(true) {    // 손익분기점 돝파할 때까지 무한 반복
				bep += 1;     // 노트북 판매갯수 1씩 증가(손익분기점 카운팅) 
				cost += b;    // 총 비용에 노트북 생산에 필요한 가변비용 삽입
				income += c;   // 총 수익 또는 총 매출에 노트북 가격 삽입
				
				if(cost < income) {    // 총 수익이 총 비용을 넘어서는 경우 -> 손익분기점 돌파 
					break;    // 반복문 탈출
				}
			}
			System.out.println(bep);     // 손익분기점 출력
		}
		scan.close();
	}
}