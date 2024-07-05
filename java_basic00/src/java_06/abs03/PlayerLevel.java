package java_06.abs03;

// 추상 클래스 : Beginner, Advanced, Super의 부모 역할
public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) { // 재정의 하면 안되므로 final로 선언
		run();
		
		for (int i=0; i<count; i++) {
			jump();
		}
		
		turn();
	}
}
