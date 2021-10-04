package 스레드;

/*	스레드 사용하는 방법(순서)
	1. 스레드 상속을 받은 클래스를 만든다.
	2. 상속을 받은 클래스에서  run()메서드를 오버라이드한다.
   (동시에 처리하고 싶은 내용을 구현)
	3. 상속받아 만들어놓은 스레드 클래스의 객체를 생성한다.
	4. cpu에 등록한다. start()	*/

public class Image1 extends Thread {
	@Override
	public void run() {
		String[] list = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg", "7.jpg", "8.jpg", "9.jpg", "10.jpg"};
		for (int i = 0; i <list.length; i++) {
			System.out.println(list[i]);
			
			try {
				Thread.sleep(3000);	//밀리세컨즈(1000에 1초)
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
}
