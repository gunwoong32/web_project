package shop.ui;

import javax.swing.JOptionPane;

import shop.dto.게시판Bag;

public class 게시판정보UI {

	public static void main(String[] args) {
		
		//1. 게시판 정보 입력받아서
		//2. 가방을 만들어서 입력받은 데이터를 넣는다.
		//3. DAO를 만들어서 DAO에게 create기능을 호출, 이때 가방을 전달
		
		String id = JOptionPane.showInputDialog("아이디를 입력하세요");
		String title = JOptionPane.showInputDialog("제목을 입력하세요");
		String content = JOptionPane.showInputDialog("내용을 입력하세요");
		String writer = JOptionPane.showInputDialog("작성자를 입력하세요");
		
		게시판Bag bag = new 게시판Bag();
		bag.setId(id);
		bag.setTitle(title);
		bag.setContent(content);
		bag.setWriter(writer);
		shop.db.게시판DAO dao = new shop.db.게시판DAO();
		dao.create(bag);
		
	}

}
