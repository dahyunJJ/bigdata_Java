package exam;

public class Ex03_printExam {

	public static void main(String[] args) {
		char txt1 = '는';
		String txt2 = "이다";
		
		boolean isTrue = true;
		boolean isFalse = false;
		
		System.out.println("푸바오" + txt1 + "자이언트 판다" + txt2 + " [" + isTrue + "]");
		System.out.println("원숭이 엉덩이" + txt1 + "노랗다" + " [" + isFalse + "]");
		System.out.println("나" + txt1 + "여자다" + " [" + isTrue + "]");
		System.out.println("나" + txt1 + "열살" + txt2 + " [" + isFalse + "]");
		System.out.println("사람의 다리" + txt1 + "3개다" + " [" + isFalse + "]");
		System.out.println("현재 시간은 오전 9시" + txt2 + " [" + isFalse + "]");
		System.out.println("나" + txt1 + "프로그래밍이 재밌다" + " [" + isTrue + "]");

	}

}
