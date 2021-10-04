package com.mega.mvc05.static1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 음식주문프로그램 {
	private static JTextField count;
	
	static int sum;
	//main이 static이므로 객체생성하지 않아도 접근이 가능한 변수여야 한다.
	//main안에서 사용하는 전역변수는 반드시 static으로 만들어주어야 한다.
	
	final static int price = 5000;//final은 상수
	
	public static void main(String[] args) {
		//main이 static인 이유는
		//객체생성하지 않아도 main부터 시작하기 때문
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(900, 900);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("개수 :");
		l1.setFont(new Font("굴림", Font.BOLD, 25));
		l1.setBounds(601, 19, 81, 57);
		f.getContentPane().add(l1);
		
		count = new JTextField();
		count.setBackground(Color.YELLOW);
		count.setFont(new Font("굴림", Font.PLAIN, 20));
		count.setBounds(679, 18, 168, 60);
		f.getContentPane().add(count);
		count.setColumns(10);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("C:\\Users\\Woong\\Desktop\\짬뽕.jpg"));
		img.setBounds(113, 108, 640, 640);
		f.getContentPane().add(img);
		
		JLabel result = new JLabel("결제금액");
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.BOLD, 30));
		result.setBounds(112, 751, 132, 74);
		f.getContentPane().add(result);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 27));
		lblNewLabel.setBounds(294, 758, 350, 74);
		f.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("짬뽕");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			sum++;
			count.setText(sum+"개");
			ImageIcon icon = new ImageIcon("짬뽕.jpg");
			img.setIcon(icon);
			lblNewLabel.setText((sum*price) + "원");
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 25));
		btnNewButton.setBounds(26, 19, 177, 65);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum+"개");
				ImageIcon icon = new ImageIcon("우동.jpg");
				img.setIcon(icon);
				lblNewLabel.setText((sum*price) + "원");
			}
		});
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 25));
		btnNewButton_1.setBounds(213, 19, 177, 65);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("짜장");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum+"개");
				ImageIcon icon = new ImageIcon("짜장.jpg");
				img.setIcon(icon);
				lblNewLabel.setText((sum*price) + "원");
			}
		});
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 25));
		btnNewButton_2.setBounds(399, 19, 177, 65);
		f.getContentPane().add(btnNewButton_2);
		
		f.setVisible(true);
	}
}
