package java_basic01;

import java.util.Scanner;

public class IfEx03 {

	public static void main(String[] args) {

		// -----------------------------------------------------
		// 학생의 성적을 Scanner로 입력받아, 학점을 출력하세요.
		//
		// 90점 이상이면, A
		// 80점 이상이면, B
		// 70점 이상이면, C
		// 60점 이상이면, D
		// 60점 미만이면, F
		// -----------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수는? : ");
		int score = sc.nextInt();
		
		String result = "";
		
		if(score >= 90) {
			result = "A";
		} else if (score >= 80) {
			result = "B";
		} else if (score >= 70) {
			result = "C";
		} else if (score >= 60) {
			result = "D";
		} else if (score < 60) {
			result = "F";
		}
		
		System.out.println("당신의 점수는 " + score + "점 이고, 학점은 " + result + "입니다.");
		
		
		
		// -----------------------------------------------------
		// Scanner를 통해 1부터 5까지의 숫자를 입력 받아 영문으로 변환
		// 
		// [ 결과 예시 ] 1 은 one 입니다.
		// -----------------------------------------------------
		
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result2 = "";
		
		if (num == 1) {
			result2 = "one";
		} else if (num == 2) {
			result2 = "two";
		} else if (num == 3) {
			result2 = "three";
		} else if (num == 4) {
			result2 = "four";
		} else if (num == 5) {
			result2 = "five";
		} else {
			result2 = "1 ~ 5까지의 숫자를 입력하세요";
		}
		
		System.out.println("입력한 숫자는 " + num + "이고, " + result2);
		
		sc.close();

	}

}