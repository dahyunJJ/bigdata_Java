package hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelDAO {
	
	final int RoomCnt = 10;

	List<Room> roomList;
	
	public HotelDAO() {
		roomList = new ArrayList<Room>(RoomCnt);
		
		for (int i=0; i<RoomCnt; i++) {
			// Room 생성자 자체를 초기값 false로 설정
			roomList.add(new Room(false));
		}
	}
	
	public void checkIn(int roomNum) {
		// 객실 체크인 - List에 속해 있는 Room 객체의 사용여부를 '사용중'으로 변경
		roomList.set(roomNum-1, new Room(true));
	}
	
	public void checkOut(int roomNum) {
		// 객실 체크아웃 = List에 속해 있는 Room 객체의 사용여부를 '사용가능(빈 객실)'로 변경
		roomList.set(roomNum-1, new Room(false));
	}
	
	public boolean selectRoomChk(int RoomNum) {
		boolean isFlag = false;
		
		isFlag = roomList.get(RoomNum-1).isUsing();
		
		return isFlag;
	}
	
	// DAO에서 가지고 있는 RoomList를 반환해주는 메소드
	public List<Room> selectRoomList() {
		return roomList;
	}
}
