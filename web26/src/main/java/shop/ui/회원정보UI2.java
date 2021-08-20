package shop.ui;

import javax.swing.JOptionPane;

import shop.db.회원DAO2;
import shop.dto.회원Bag;

public class 회원정보UI2 {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("회원가입 id 입력");
		String pw = JOptionPane.showInputDialog("회원가입 pw 입력");
		String name = JOptionPane.showInputDialog("회원가입 name 입력");
		String tel = JOptionPane.showInputDialog("회원가입 tel 입력");
		
		회원DAO2 dao2 = new 회원DAO2();
		회원Bag bag = new 회원Bag();		//가방
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		dao2.create(bag);				//가방 주소 넘기기
		System.out.println("dao2의 create하고난뒤 실행됨.");
		
	}

}
