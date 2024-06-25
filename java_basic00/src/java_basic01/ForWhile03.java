package java_basic01;

import java.util.Scanner;

public class ForWhile03 {

	public static void main(String[] args) {

		// 정수를 입력 받아 구구단을 출력해 보세요.
		// 단, 1 ~ 9단 까지만 허용
		
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 단수의 구구단을 출력할까요 : ");
		
		int dan = sc.nextInt();
		
		if(dan >=1 && dan < 10) {
		
			// while 문 활용
			System.out.println("====== [ while문 ] " + dan + " 단 ==========");
			
			int c = 1;
			
			while (c <= 9) {
				int total = 0;
				
				total = dan * c;			
				System.out.println(dan + "*" + c + "=" + total);
				
				c++;
			}
					
			
			// for 문 활용
			System.out.println("====== [ for문 ] " + dan + " 단 ==========");
			
			for (int i=1; i<=9; i++) {
				int result = 0;
				
				result = dan * i;
				System.out.println(dan + "*" + i + "=" + result);
				
			}
		} else {
			System.out.println("1~9단까지만 출력할 수 있습니다!");
		}		
		
		
		sc.close();
		
	}

}