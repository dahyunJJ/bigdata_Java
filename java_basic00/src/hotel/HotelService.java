package hotel;

import java.util.List;
import java.util.Scanner;

public class HotelService {

	public static HotelDAO hotelDAO;
	public static Scanner sc = new Scanner(System.in);

	public HotelService() {
		hotelDAO = new HotelDAO();
	}
	
	// 프로그램을 start하기 위한 메소드 구현
	public void startProgram() {

		while (true) {
			int choice = printMenu();
			
			switch(choice) {
			case 1 :
				// 입실
				checkIn();
				break;
				
			case 2 :
				// 퇴실
				checkOut();
				break;
				
			case 3 :
				// 방보기
				roomInfo();
				break;
				
			case 4 :
				// 프로그램 종료
				System.out.println("프로그램 종료!");
				System.exit(0);
				break;
				
			default :
				System.out.println("1~4 사이의 수를 선택해 주세요.");
				break;
			}
		}
	}
	
	// 메뉴를 받아줄 메소드 구현
	public int printMenu() {
		int choice = 0;
		
		// === 호텔 관리 프로그램 ===
		// [ 호텔에는 총 0000개의 객실이 있습니다. ]
		// 1. 입실  2. 퇴실  3. 방보기  4. 종료
		// 선택 : 
		// 메뉴 입력을 받아주세요.
		
		System.out.println("");
		System.out.println("=== 호텔 관리 프로그램 ===");
		System.out.println("[ 호텔에는 총 " + hotelDAO.RoomCnt +"개의 객실이 있습니다. ]");
		System.out.println("---------------------------------------------------");
		System.out.println("1. 입실  2. 퇴실  3. 방보기  4. 종료");
		System.out.println("선택 : ");
		
		choice = sc.nextInt();
		
		return choice;
	}
	
	public void checkIn() {
		System.out.println("몇 번 방에 입실하시겠습니까?");
		int roomNum = sc.nextInt();
		
		// [ 체크 1 ] 1~RoomCnt 사이의 객실 번호를 입력하였는지
		// [ 체크 2 ] 선택한 객실에 손님이 있는지
		// 체크 1, 2가 아니어야 정상적으로 입실 가능
		
		if (roomNum < 1 || roomNum > hotelDAO.RoomCnt) {
			System.out.println("호텔에는 1 ~ " + hotelDAO.RoomCnt + "호실까지의 객실이 있습니다.");
			System.out.println("다시 선택해 주세요.");
		} else if (hotelDAO.selectRoomChk(roomNum)) {
			System.out.println("해당 객실은 이미 손님이 계십니다. 다른 객실을 선택해 주세요.");
		} else {
			// 객실 체크인
			hotelDAO.checkIn(roomNum);
			System.out.println("객실 체크인이 완료 되었습니다. 즐거운 하루 되세요!");
		}		
	}
	
	// 2. 퇴실 메소드
	public void checkOut() {
		System.out.println("몇 번 객실에서 퇴실하시겠습니까?");
		int roomNum = sc.nextInt();
		
		if(hotelDAO.selectRoomChk(roomNum)) {
			hotelDAO.checkOut(roomNum);
			System.out.println("객실 체크아웃이 완료 되었습니다. 안녕히 가세요!");
		} else {
			System.out.println("해당 객실은 이미 비어있습니다. 룸 넘버를 다시 확인해주세요.");			
		}
	}
	
	
	// 3. 방보기 메소드
	public void roomInfo() {
		// roomList 받아오기
		List<Room> rooms = hotelDAO.selectRoomList();
		
		// roomList에서 Room 객체의 사용여부를 확인할 수 있도록 반복문 구성
		// Room 객체의 사용 여부는 isUsing으로 알 수 있다.
		// isUsing = true : 사용중 | isUsing = false : 사용가능(빈 객실)
		
		int cnt = 1;
		
		for (Room r : rooms) {
			if (r.isUsing() == true) {
				System.out.println(cnt + "호 객실은 현재 손님이 있습니다.");
			} else {
				System.out.println(cnt + "호 객실은 현재 비어 있습니다.");
			}
			
			cnt++;
		}
		
	}
}
