package java_01;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// -----------------------------------------------------
		// Scanner를 통해 1~12 사이의 정수를 입력 받아 해당 월의 마지막 일자를 출력
		// 
		// [ 출력 결과 예시 ] 6월의 마지막 날짜는 31일 입니다.
		// -----------------------------------------------------

		System.out.println("숫자를 입력하세요. (1~12)");
		System.out.println(">>");
		int num = sc.nextInt();
		
		String result = "";
		
		switch (num) {
		case 1, 3, 5, 7, 8, 10, 12 :
			result = "31일 입니다.";
			break;
		case 2 : 
			result = "28(29)일 입니다.";
			break;
		case 4, 6, 9, 11 :
			result = "30일 입니다.";
			break;
		
		default :
			result = "없습니다.";
			break;
		}
		
		System.out.println(num + "월의 마지막 날짜는 " + result);		
		System.out.println();		
		
		
		
		
		// 동일한 조건식을 if문으로 작성해보기
		
		System.out.println("숫자를 입력하세요. (1~12)");
		System.out.println(">>");
		int num2 = sc.nextInt();
		
		String result2 = "";

		if (num2 == 1 || num2 == 3 || num2 == 5 || num2 == 7 || num2 == 8 || num2 == 10 || num2 == 12) {
			result2 = "31일 입니다.";
		} else if (num2 == 2) {
			result2 = "28(29)일 입니다.";
		} else if (num2 == 4 || num2 == 6 || num2 == 9 || num2 == 11) {
			result2 = "30일 입니다.";
		} else {
			result2 = "없습니다.";
		}
		
		System.out.println(num2 + "월의 마지막 날짜는 " + result2);
		
		
		sc.close();

	}

}