package java_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class LottoStore {

	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new LottoStore().startLotto();
	}

	public void startLotto() {
		while (true) {
			int choice = displayMenu();

			switch (choice) {
			case 1:
				// 로또 구매하기
				saleLotto();
//				createLotto(10000); 
				break;
			case 2:
				// 프로그램 종료
				System.out.println("감사합니다. 안녕히 가세요.");
				return;
			default:
				System.out.println("1 또는 2를 입력해 주세요!");
				break;
			}
		}
	}

	public int displayMenu() {
		System.out.println("===== 로또 판매점 =====");
		System.out.println("1. Lotto 구매하기");
		System.out.println("2. 프로그램 종료");
		System.out.println("=====================");
		System.out.println("선택 : ");

		int choice = sc.nextInt();

		return choice;
	}

	// 금액 받고 로또 판매
	public void saleLotto() {
		System.out.println("1000원에 로또 번호 하나씩 입니다.");
		System.out.println("로또는 최대 100매까지 구매 가능합니다.");
		System.out.println("금액 입력 : ");
		
		int money = sc.nextInt();
		
		System.out.println();
		
		if (money < 1000) {
			System.out.println("입력 금액이 너무 적습니다. 1000원 이상으로 입력해 주세요.");
			return;
		} 
		
		if (money >= 100001) {
			System.out.println("10만원 이상은 구매 불가합니다.");
			return;
		}
		
		// 로또 번호 만들기
		createLotto(money);
		
		System.out.println();
		
		// 거스름 돈 계산하기		
		System.out.println("받은 금액은 " + money + "원 이고, 거스름돈은 " + (money % 1000) + "원 입니다.");
		System.out.println();
		
	}

	// 로또 번호 생성
	public void createLotto(int money) {
		int lotCnt = money / 1000;

		// 중복되는 데이터(로또 번호)를 방지하기 위해 HashSet 사용
		HashSet<Integer> lottoSet = new HashSet<Integer>();
		
		// 1장의 로또 생성 (6개의 번호)
		for (int i = 1; i <= lotCnt; i++) {
			while (lottoSet.size() < 6) {
				int lotNum = (int) (Math.random() * 45 + 1); // + 1 : 0부터 나오는 것 방지
				
				lottoSet.add(lotNum);
			}
			
			// 로또를 1장씩 배열리스트에 저장
			ArrayList<Integer> lottoList = new ArrayList<Integer>(lottoSet);
			// 로또 번호 정렬
			Collections.sort(lottoList);
			
			System.out.print("로또 번호 : " + i + " 번 >>> ");
			
			for (int lottoNum : lottoList) {
				System.out.print(lottoNum + " ");
			}
			
			System.out.println();
			
			// clear() : 반복적으로 하는 로직에는 초기화 작업 해주기
			lottoSet.clear();
			
		}
		
		
		
	}
}
