package bronze;

import java.util.Scanner;

public class Test2908 {
	
	public static void main(String[] args) {
		
		/* 상수 - (입력받은 두 개의 숫자를 뒤집은 다음, 크기 비교 후 더 큰 수를 출력하는 문제)
		 * 
		 * 상근이의 동생 상수는 수학을 정말 못한다. 수학을 못하는 상수를 위해 상근이는 수의 크기를 비교하는 
		 * 문제를 내주었다. 상근이는 두개의 수를 칠판에 써준 다음 크기가 큰 수를 말해보라고 했다.
		 * 
		 * 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면,
		 * 상수는 이 수를 437과 398로 읽는다. 따라서 상수는 두 수중 큰수인 437을 큰 수라고 말할 것이다.
		 * 
		 *  두 수가 주어졌을 때 상수의 대답을 출력하는 프로그램을 작성하시오.
		 */
		
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		String strNum1 = String.valueOf(num1);
		int num2 = scan.nextInt();
		String strNum2 = String.valueOf(num2);

		String rStrNum1 = new StringBuffer(strNum1).reverse().toString();
		String rStrNum2 = new StringBuffer(strNum2).reverse().toString();
		
		int rNum1 = Integer.parseInt(rStrNum1);
		int rNum2 = Integer.parseInt(rStrNum2);
		
		if(rNum1 > rNum2) {
			System.out.println(rNum1);
		} else {
			System.out.println(rNum2);
		}
	
	}
}
