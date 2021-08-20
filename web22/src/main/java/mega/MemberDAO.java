package mega;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
   public int create(String id, String pw, String name, String tel) throws Exception {
      //++�ڹٿ� DB�����ϴ� ���α׷�(=JDBC) ����
      //1.JDBC Connector ����
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("1. connector ���Ἲ��!!");
    
      //2.java���� DB�� ���� : ������ �ּ� URL(ip, port, DB��), user name, password
      String url = "jdbc:mysql://localhost:3306/shop";
      String user = "root";
      String password = "1234";
      Connection con = DriverManager.getConnection(url, user, password);
      //import java.sql.Connection;���Ȯ��
      System.out.println("2. db ���Ἲ��!");
      
      //3.sql���� �����.
      String sql = "insert into member values (?, ?, ?, ?)";
//      PreparedStatement => sql�� ��ü, �ſ� sql�� ������� �Ű� ���� �ǹ�
      PreparedStatement ps = con.prepareStatement(sql);//con�� ��������
      ps.setString(1, id);
      ps.setString(2, pw);
      ps.setString(3, name);
      ps.setString(4, tel);
      System.out.println("3. SQL�� ���Ἲ��!!");
      
      //4.sql���� mysql�� �����Ѵ�.
      int result = ps.executeUpdate();
      System.out.println("4. SQL�� ���� ����!");
      System.out.println("SQL�� ���ళ�� " + result);
      return result; 
   }//create end
   
   //==�ʿ信���� ()�̺κи� �����ؼ� ����ϸ��
   public int update(String id, String tel) throws Exception {
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("1. connector ���Ἲ��!!");
      //==�ʿ信���� DB�� �����ؼ� ����ϸ��
      String url = "jdbc:mysql://localhost:3306/shop";
      String user = "root";
      String password = "1234";
      Connection con = DriverManager.getConnection(url, user, password);
      System.out.println("2. db ���Ἲ��!");
      //==�ʿ信���� �̺κи� �����ؼ� ����ϸ��
      String sql = "update member set tel= ? where id = ?";
      PreparedStatement ps = con.prepareStatement(sql);
      //==���� String sql = "update member set tel= ? where id = ?"; ���� ����ǥ ������ ���߱�
      ps.setString(1, tel);
      ps.setString(2, id);
      System.out.println("3. SQL�� ���Ἲ��!!");
      int result = ps.executeUpdate();
      System.out.println("4. SQL�� ���� ����!");
      System.out.println("SQL�� ���ళ�� " + result);
      return result;
   }//update end

   
   //==�ʿ信���� ()�̺κи� �����ؼ� ����ϸ��
   public int delete(String id) throws Exception {
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("1. connector ���Ἲ��!!");
      String url = "jdbc:mysql://localhost:3306/shop";
      String user = "root";
      String password = "1234";
      Connection con = DriverManager.getConnection(url, user, password);
      System.out.println("2. db ���Ἲ��!");
      //==�ʿ信���� �̺κи� �����ؼ� ����ϸ��
      String sql = "delete from member where id = ?";
      PreparedStatement ps = con.prepareStatement(sql);
      //==�ʿ信���� �̺κи� �����ؼ� ����ϸ��
      ps.setString(1, id);
      System.out.println("3. SQL�� ���Ἲ��!!");
      int result = ps.executeUpdate();
      System.out.println("4. SQL�� ���� ����!");
      System.out.println("SQL�� ���ళ�� " + result);
      return result; 
   }//delete end

}