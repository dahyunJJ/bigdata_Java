package exam;

public class Ex02_PrintExam {

	public static void main(String[] args) {
		int month = 12;
		int day = 25;
		String holiday = "크리스마스";
		
		int curYear = 2024;
		int varNum = 1;
		int yearResult;
		
		yearResult = curYear - varNum;
		
		float percent = 72.893f;
		
		int num1 = 100; 
		int num2 = 10;
		int numResult = num1 + num2;
		
		double circle = 3.141592653589793d;
		int radius = 5;
		
		double circleResult;
		circleResult = circle * radius * 2;
		
		double areaResult;
		areaResult = circle * radius * radius;
		
		char txt = '뷁';
		int txtNum = txt;
		
		float num3 = 58.78945f;
		int numVal = (int) num3;
		
		System.out.println(month + "월 " + day + "일은 " + holiday + "입니다.");
		System.out.println("작년 " + yearResult + "년도 대학 합격률은 " + percent + " 퍼센트 였습니다.");
		System.out.println(num1 + "이라는 숫자에 " + num2 + "을 더하면 " + numResult + "이 됩니다.");
		System.out.println("원주율은" + circle + " 이고, 반지름이 " + radius + "인 원의 둘레는 " + circleResult + "입니다.");
		System.out.println("반지름이 " + radius + "인 원의 넓이는 " + areaResult + "입니다.");
		System.out.println(txt + "의 문자번호는 " + txtNum + "입니다.");
		System.out.println(num3 + "를 버림 하면 " + numVal + "입니다.");
		
		

	}

}
