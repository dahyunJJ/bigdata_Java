package hotel;

public class Room {
	
	// 객실이 사용중인지 아닌지 객체 선언
	private boolean isUsing;
	// true : 사용중
	// false : 사용가능(빈 객실)
	
	// 기본 생성자
	public Room() {
		
	}
	
	// 매개 변수 생성자
	public Room(boolean isUsing) {
		this.isUsing = isUsing;
	}

	// Getter 메소드
	public boolean isUsing() {
		return isUsing;
	}
	
	// Setter 메소드
	public void setUsing(boolean isUsing) {
		this.isUsing = isUsing;
	}

}
