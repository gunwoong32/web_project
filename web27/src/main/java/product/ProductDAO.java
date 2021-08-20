package product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ProductDAO {
	Connection con;		// 전역변수, 클래스 아래에 선언한 변수, 클래스 전체에서 접근하여 사용가능한 변수
	//생성자 메서드, 생성자(constructor)
	//new키워드로 객체생성할 때 ㅋ르래스이름과 동일한 메서드가 있으면 자동 호출되는 메서드
	//객체 생성시 자동으로 꼭 해야하는 작업이 있는 경우, 이 생성자안에 넣어놓으면 무조건
	//처리하게 할 수 있다.
	
	public ProductDAO() {
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
			  con = DriverManager.getConnection(url, username, password);
			  System.out.println("2. shop db연결 성공!!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//READ ONE START
	public ProductDTO read(ProductDTO dto) {
		//메서드 안에서 만들어진 변수
		//변수는 변수선언할 때 만들어짐
		//선언의 위치가 변수의 생존범위를 결정함.
		//파라미터는 지역변수이다. 이 지역을 벗어나서는 사용불가능.
		//지역변수는 자동초기화안된다. 쓰레기값 들어있는 상태
		System.out.println("전달된 id는 " + dto.getId());
		System.out.println("전달된 name는 " + dto.getName());
		System.out.println("전달된 content는 " + dto.getContent());
		System.out.println("전달된 price는 " + dto.getPrice());
		ResultSet rs = null;
		
		ProductDTO dto2 = new ProductDTO();
		 try {
			
			  //3. sql문을 만든다.
			  String sql = "select * from product where id = ? ";
			  //String sql = "select * from member";
			  //PrepareStatment : sql을 나타내는 부품.
			  //부품을 램에 넣어놓은 주소만 잇으면 됨.
			  //ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, dto.getId());
			  System.out.println("3. sql문 생성 성공!!!");
//	      String url = "http://www.naver.com";
//	      URL u = new URL(url);
//	      String file = "c:/temp/test.txt";
//	      File file2 = new File(file);
			  
			  //4. sql문을 mysql로 전송한다.
			  //result = ps.executeUpdate();	//CUD일때만 사용, read에선 사용x
			  rs = ps.executeQuery();
			  System.out.println("4. sql문 전송 전송");
			  //System.out.println("검색된 결과는 " + rs.next());
			  //rs.next() 한번하면 다음칸으로 내려가기 때문에 막아준다.
			  if (rs.next()) {
				  System.out.println("검색 결과가 있음");
				  String id = rs.getString(1);	//a를 가져옴//rs.getString("컬럼명"); 도 가능.
				  String name = rs.getString(2);	//a
				  String content = rs.getString(3);	//a
				  String price = rs.getString(4);	//a
				  System.out.println(id);
				  System.out.println(name);
				  System.out.println(content);
				  System.out.println(price);
				  dto2.setId(id);
				  dto2.setName(name);
				  dto2.setContent(content);
				  dto2.setPrice(price);
			}
			  else {
				System.out.println("검색 결과가 없음");
			}
		} catch (SQLException e) {
			System.out.println("2-4번에러>>드라이버 없음!!!");
			e.printStackTrace();
		}
		 return dto2;
	}	//read END
	
	
	
	
	//read START
		public ArrayList<ProductDTO> read() {
			
			
			ResultSet rs = null;
			
			//DTO를 넣을 컨테이너 역할을 하는 ArrayList를 만들어주어야 한다.
			ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
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
				  String sql = "select * from product";
				  PreparedStatement ps = con.prepareStatement(sql);
				  System.out.println("3. sql문 생성 성공!!!");
				  
				  //4. sql문을 mysql로 전송한다.
				  //result = ps.executeUpdate();	//CUD일때만 사용, read에선 사용x
				  rs = ps.executeQuery();
				  System.out.println("4. sql문 전송 전송");
				  //System.out.println("검색된 결과는 " + rs.next());
				  //rs.next() 한번하면 다음칸으로 내려가기 때문에 막아준다.
				  while (rs.next()) {
					  ProductDTO bag2 = new ProductDTO();
					  System.out.println("검색 결과가 있음");
					  bag2.setId(rs.getString(1));
					  bag2.setName(rs.getString(2));
					  bag2.setContent(rs.getString(3));
					  bag2.setPrice(rs.getString(4));
					  System.out.println(bag2);
					  list.add(bag2);
					  System.out.println(list.size());
				}
			} catch (ClassNotFoundException e) {
				System.out.println("1번에러>>드라이버 없음!!!");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("2-4번에러>>드라이버 없음!!!");
				e.printStackTrace();
			}
			 return list;
		}	//read END
}
