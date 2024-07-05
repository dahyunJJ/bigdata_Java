package java_06.abs03;

public class Player {
	// 매개변수 생성
	private PlayerLevel level;

	// 기본 생성자
	public Player() {
		level = new BeginnerLevel(); // level 변수를 BeginnerLevel의 인스턴스로 초기화
		level.showLevelMessage();
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		this.level.go(count);
	}

	// getters
	public PlayerLevel getLevel() {
		return level;
	}

	// setters
	public void setLevel(PlayerLevel level) {
		this.level = level;
	}

}
