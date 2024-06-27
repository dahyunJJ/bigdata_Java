package java_00; 

public class Operator04 {
	public static void main(String[] args) {

		/*
		 * [ 당신의 선택은? 치킨 vs 소 ]
		 * 
		 * 입력받을 변수는 1 또는 2
		 * 1번은 닭 vs 2번은 소
		 * 닭은 치킨 vs 소는 스테이크
		 * 
		 * 결과물 예시 : 가져오신 동물은 닭이므로, 치킨을(를) 요리하겠습니다.
		 * 결과물 예시 : 가져오신 동물은 소이므로, 스테이크을(를) 요리하겠습니다.
		 * 
		 */
		
		int num = 2;
		String chicken = "닭";
		String beef = "소";
		
		String animal = num == 1 ? chicken : beef;
		System.out.println(animal);
		
		String food = animal == chicken ? "치킨" : "스테이크";
		System.out.println(food);
		
		
		System.out.println("가져오신 동물은 " + animal + "이므로, " + food + "을(를) 요리하겠습니다.");
		System.out.println();
		
		
		// 선생님 코드
		int animalNum = 1;
		String animal2 = "";
		String animalResult = "";
		
		animal2 = (animalNum == 1) ? "닭" : "소";
		animalResult = (animal == "닭") ? "치킨" : "스테이크";
		
		System.out.println("가져오신 동물은 " + animal2 + "이므로, " + animalResult + "을(를) 요리하겠습니다.");
		System.out.println();
		
		
		/*
		 * [ 홀짝 감별기 ]
		 * 
		 * 입력받은 변수의 값이 홀이냐 짝이냐를 구분
		 *  
		 * 결과물 예시 : 입력하신 숫자 3은(는) 홀수입니다.
		 * 결과물 예시 : 입력하신 숫자 8은(는) 짝수입니다.
		 * 
		 */

		int num2 = 11;
		String numResult = "";
		
		numResult = (num2 % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println("입력하신 숫자 " + num2 + "은(는) " + numResult + "입니다.");
		
		
		// 소수점 자리 표기
		float f = 10.11f; // 소수점 뒤에 f를 붙이면 원하는 소수점 자리까지 표시가능
		System.out.println(f);
		
		/*
		 * [평균 구하기]
		 * 
		 * 입력 값 : 국어, 영어, 수학
		 * 조건1) : 국어, 영어, 수학 점수의 평균을 구하여 85점 이상이면 합격 / 미만이면 불합격
		 * 조건2) : 평균 점수는 소수점 자리까지 표시
		 * 
		 * 결과물 예시 :
		 * 당신의 국어 점수는 85점 입니다.
		 * 당신의 영어 점수는 90점 입니다.
		 * 당신의 수학 점수는 60점 입니다.
		 * 
		 * 당신의 평균 점수는 78.33 이고, 불합격 입니다.
		 */
		
		int korScore = 85;
		int engScore = 90;
		int mathScore = 61;
		String avgResult = ""; 
		
		System.out.println("당신의 국어 점수는 " + korScore + "점 입니다.");
		System.out.println("당신의 영어 점수는 " + engScore + "점 입니다.");
		System.out.println("당신의 수학 점수는 " + mathScore + "점 입니다.");		
		
		double average;
		// average = (float)(korScore + engScore + mathScore) / 3 ;
		//float average = (korScore + engScore + mathScore) / 3.0f ;
		average = (korScore + engScore + mathScore) / 3.0;
		
		
		avgResult = 85 <= average ? "합격" : "불합격";
		System.out.println("당신의 평균 점수는 " + average + " 이고, " + avgResult + "입니다.");
		

	}
}
