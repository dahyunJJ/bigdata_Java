package java_01;

public class ForWhile04 {

	public static void main(String[] args) {

		// 1~9단까지 구구단을 모두 출력해 보세요.
		
		// while 문 활용
		System.out.println("====== [ while문 ] 구구단 ==========");
		
		int dan = 1;
		
		while (dan <= 9) {
			int k = 1;

			while (k <= 9) {
				int result = 0;	
				result = dan * k;
				
				System.out.println(dan + "*" + k + "=" + result);
				
				k++;
			}
			
			dan++;						
		}
		
				
		// for 문 활용
		System.out.println("====== [ for문 ] 구구단 ==========");		
		
		for (int i=1; i<=9; i++) {
			int result = 0;
			
			for (int c=1; c<=9; c++) {
				result = i * c;
				
				System.out.println(i + "*" + c + "=" + result);
			}			
		}
		
		
	}

}