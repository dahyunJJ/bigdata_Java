package java_01;

import java.util.Scanner;

public class ForWhile01 {

	public static void main(String[] args) {

		// (예제) 1부터 10까지의 합을 For문으로
		
		int forTotal = 0;

		for (int i=1; i<=10; i++) {
			forTotal = forTotal + i;
			// forTotal += i;

			// System.out.println(i + " :: " + forTotal);
		}

		System.out.println("for total ==== " + forTotal);
		


		// (예제) 1부터 100까지의 합을 While문으로
		
		int w = 1;
		int whileTotal = 0;

		while (w <= 100) {
			whileTotal = whileTotal + w;
			// whileTotal += w;			
			w++;

			// System.out.println(w + " :: " + whileTotal);
		}

		System.out.println("while total ==== " + whileTotal);
		System.out.println();
		
		
		
		///////////////////////////////////////////////////////
		
		// (for) 1~100까지의 정수 중 6의 배수 출력		
		System.out.println("[for 6의 배수]");
		
		for (int i=1; i<=100; i++) {
			if (i % 6 == 0) {
				System.out.print(i + " ");
			}
		}		
		
		System.out.println();
		
		// (while) 1~100까지의 정수 중 6의 배수 출력
		int k = 1;
		
		System.out.println("[while 6의 배수]");
		
		while (k <= 100) {
			if (k % 6 == 0) {
				System.out.print(k + " ");
			}
			
			k++; // while문은 증감연산자 꼭 써줘야함. 안그러면 에러
		}
				
		System.out.println();
		
		// (for) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력
		System.out.println("[for 6의 배수이면서 12의 배수는 아닌 수]");
		
		for (int a=1; a<=200; a++) {
			if (a % 6 == 0 && a % 12 != 0) {
				System.out.print(a + " ");
			}
		}	
				
		System.out.println();
		
		// (while) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력
		int e = 1;
		
		System.out.println("[while 6의 배수이면서 12의 배수는 아닌 수]");
		
		while (e <= 200) {
			if (e % 6 == 0 && e % 12 != 0) {
				System.out.print(e + " ");
			}
			
			e++;
		}
		
		System.out.println();
		
		// (for) 1~60000까지의 정수 중 100의 배수는 몇 개일까요?
		int cnt = 0;
		
		for (int i=1; i<=60000; i++) {
			if (i % 100 == 0) {
				cnt++;				
			}
		}
		System.out.println("(for) 1~60000까지의 정수 중 100의 배수는" + cnt + "입니다.");
		
		// (while) 1~60000까지의 정수 중 100의 배수는 몇 개일까요?
		int d = 1;
		int count = 0;
		
		while (d <= 60000) {
			if (d % 100 == 0) {
				count++;
			}			
			d++;
		}
		System.out.println("(while) 1~60000까지의 정수 중 100의 배수는" + count + "입니다.");
		
	}

}