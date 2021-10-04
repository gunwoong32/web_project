package 스레드;

public class 동시처리Main3 {

	public static void main(String[] args) {
		//1. thread 객체 생성
		Count1 thread1 = new Count1();
		Image1 thread2 = new Image1();
		Timer1 thread3 = new Timer1();
		
		//2. cpu에 스레드를 등록해주어야함
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println("스레드 종료");
		
		
	}

}
