package 자바심화;

import java.util.ArrayList;
import java.util.Scanner;

public class 문제풀이2 {

	public static void main(String[] args) {
		ArrayList<E>
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("---------------");
			System.out.println("1. 학생 정보 출력");
			System.out.println("2. 학생 정보 추가");
			System.out.println("3. 학생 삭제");
			System.out.println("4. 학생 변경");
			System.out.println("9. 종료");
			System.out.print("메뉴를 선택하시오>> ");
			int choice = sc.nextInt();
			
			if (choice == 9) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else if (choice == 1) {
				System.out.println(list);
			} else if (choice == 2) {
				System.out.print("학생 이름을 입력하세요.>> ");
				System.out.print("학생 학년을 입력하세요.>> ");
				System.out.print("학생 학점을 입력하세요.>> ");
				System.out.print("학생 번호를 입력하세요.>> ");
			} else if (choice == 3) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i+ "번: " + list.get(i));
				}
				System.out.print("삭제할 학생의 번호를 입력하세요.>> ");
				list.remove(sc.nextInt());
			}
		}
		
		
	}

}
