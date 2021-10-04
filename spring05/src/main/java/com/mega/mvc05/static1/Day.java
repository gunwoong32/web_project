package com.mega.mvc05.static1;

public class Day {
	//멤버변수, 전역변수, 자동초기화
	String doing;	//null
	int time;//0				static 없으면 인스턴스변수
	String location;//null
	static int count;//0 static쓰면 static변수
	static int sum;
	
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sum += time;
	}
	
	//스테틱 메서드는 객체생성하지 않아도
	//아무때나 클래스이름으로 접근해서 그 기능을 처리하게 할 수 있다.
	//자주 쓰는 기능은 static메서드로 만들어놓으면 아무때나 쓸 수 있어서 편하다.
	
	//public static int getAvg() {
		//static메서드 안에는 static변수만 사용가능하다. instance 변수 사용 불가능!!!
		//instance변수는 객체 생성후 접근이 가능하기 때문이다.
		//static메서드는 객체생성하지않아도 접근해서 처리를 해야함.
		//return sum/count;
//	}
	
	
	//static메서드니까 static변수만 사용한다!!!
	public static int getAvg() {
		return sum/count;
	}
	
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
}
