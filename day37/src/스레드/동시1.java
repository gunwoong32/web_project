package 스레드;

import java.lang.*;	//묵시적 import


public class 동시1 extends Thread{
	//run메서드를 오버라이드해서 구현해주면 , run메서드 내의 구현 부분이 동시에 처리가 된다.
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("동시1>> " + i);
		}
	}
	
}
