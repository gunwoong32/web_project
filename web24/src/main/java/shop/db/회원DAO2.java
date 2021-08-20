package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import shop.dto.회원Bag;

public class 회원DAO2 {
	
	//메서드를 호출할 때 값을 전달하게 되는데 중간에 저장할 목적으로
	//매개체 역할을 해주는 변수, 메서드 안에 있는 변수들을 매개변수라고 합니다.
	//파라미터
	public void create(회원Bag bag) {
		//메서드 안에서 만들어진 변수
		//변수는 변수선언할 때 만들어짐
		//선언의 위치가 변수의 생존범위를 결정함.
		//파라미터는 지역변수이다. 이 지역을 벗어나서는 사용불가능.
		//지역변수는 자동초기화안된다. 쓰레기값 들어있는 상태
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 tel는 " + bag.getTel());
		
		 
		 try {
			//자바와 db연결하는 프로그램(JDBC) 순서
			  //1. jdbc connector설정
			  Class.forName("com.mysql.jdbc.Driver");
			  System.out.println("1. connector연결 성공!!!");
			  
			  //2. java에서 db로 연결: 
			  //   연결할 주소url(ip, port, db명), username, password
			  String url = "jdbc:mysql://localhost:3306/shop";
			  String username = "root";
			  String password = "1234";
			  Connection con = DriverManager.getConnection(url, username, password);
			  System.out.println("2. shop db연결 성공!!!");
			  
			  //3. sql문을 만든다.
			  String sql = "insert into member values (?, ?, ?, ?)";
			  //String sql = "delete from member where id = 'win'";
			  //PrepareStatment : sql을 나타내는 부품.
			  //부품을 램에 넣어놓은 주소만 잇으면 됨.
			  //ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, bag.getId());
			  ps.setString(2, bag.getPw());
			  ps.setString(3, bag.getName());
			  ps.setString(4, bag.getTel());
			  System.out.println("3. sql문 생성 성공!!!");
//	      String url = "http://www.naver.com";
//	      URL u = new URL(url);
//	      String file = "c:/temp/test.txt";
//	      File file2 = new File(file);
			  
			  //4. sql문을 mysql로 전송한다.
			  int result = ps.executeUpdate();
			  System.out.println("4. sql문 전송 전송");
			  System.out.println(result);
		} catch (ClassNotFoundException e) {
			System.out.println("1번에러>>드라이버 없음!!!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("2-4번에러>>드라이버 없음!!!");
			e.printStackTrace();
		}
		  
	}
	
	//하나의 이름으로 메서드 이름을 쓸수있다.
	//입력값의 형태가 다양한 형태이어야 한다.
	//다형성=[오버로딩]
	
	public void read() {
		
	}
	public void update() {
		
	}
	public void delete() {
		
	}
	
}
