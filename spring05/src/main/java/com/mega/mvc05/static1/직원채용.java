package com.mega.mvc05.static1;

public class 직원채용 {

	public static void main(String[] args) {
		직원 직원1 = new 직원("홍길동",'남',25);
		직원 직원2 = new 직원("김길동",'여',26);
		직원 직원3 = new 직원("송길동",'남',27);
		
		/* 모든 직원의 정보 */
		System.out.println(직원1);
		System.out.println(직원2);
		System.out.println(직원3);
		
		/* 직원의 수 */
		System.out.println(직원.count);
		
		/* 나이 평균 */
		System.out.println(직원.sum/직원.count);
	}

}
